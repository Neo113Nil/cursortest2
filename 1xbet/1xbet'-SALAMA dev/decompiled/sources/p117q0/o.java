package p117q0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import p031e1.k;
import p033e3.h;
import p096n1.e;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f15762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f15766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f15767f;

    public o(int i7, int i8, Bundle bundle, h hVar, String str, e eVar) {
        this.f15767f = hVar;
        this.f15762a = eVar;
        this.f15763b = str;
        this.f15764c = i7;
        this.f15765d = i8;
        this.f15766e = bundle;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f15762a;
        IBinder binder = ((Messenger) eVar.f15314b).getBinder();
        h hVar = this.f15767f;
        ((s) hVar.f12673a).f15787e.remove(binder);
        String str = this.f15763b;
        h hVar2 = new h((s) hVar.f12673a, str, this.f15764c, this.f15765d, eVar);
        s sVar = (s) hVar.f12673a;
        sVar.getClass();
        hVar2.f15750f = sVar.b(this.f15766e);
        sVar.getClass();
        if (hVar2.f15750f == null) {
            StringBuilder sbK = k.k("No root for client ", str, " from service ");
            sbK.append(o.class.getName());
            Log.i("MBServiceCompat", sbK.toString());
            try {
                eVar.A(2, null);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                return;
            }
        }
        try {
            sVar.f15787e.put(binder, hVar2);
            binder.linkToDeath(hVar2, 0);
            MediaSessionCompat$Token mediaSessionCompat$Token = sVar.f15789x;
            if (mediaSessionCompat$Token != null) {
                p028d6.k kVar = hVar2.f15750f;
                String str2 = (String) kVar.f12447b;
                Bundle bundle = (Bundle) kVar.f12448c;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", str2);
                bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                bundle2.putBundle("data_root_hints", bundle);
                eVar.A(1, bundle2);
            }
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
            sVar.f15787e.remove(binder);
        }
    }
}
