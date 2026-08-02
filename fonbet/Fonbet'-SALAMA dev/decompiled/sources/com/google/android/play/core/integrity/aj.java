package com.google.android.play.core.integrity;

import A3.C0056e;
import A3.E;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final C0056e f11589a;

    /* renamed from: b, reason: collision with root package name */
    private final A3.z f11590b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11591c;

    /* renamed from: d, reason: collision with root package name */
    private final at f11592d;

    /* renamed from: e, reason: collision with root package name */
    private final k f11593e;

    public aj(Context context, A3.z zVar, at atVar, k kVar) {
        this.f11591c = context.getPackageName();
        this.f11590b = zVar;
        this.f11592d = atVar;
        this.f11593e = kVar;
        A3.z zVar2 = A3.g.f653a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (A3.g.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    this.f11589a = new C0056e(context, zVar, "IntegrityService", ak.f11594a, new E() { // from class: com.google.android.play.core.integrity.ae
                        @Override // A3.E
                        public final Object a(IBinder iBinder) {
                            int i7 = A3.t.f661x;
                            if (iBinder == null) {
                                return null;
                            }
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                            return queryLocalInterface instanceof A3.u ? (A3.u) queryLocalInterface : new A3.s(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                        }
                    });
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        zVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", A3.z.c(zVar.f662a, "Phonesky is not installed.", objArr));
        }
        this.f11589a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l7, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f11591c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l7 != null) {
            bundle.putLong("cloud.prj", l7.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A3.m(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(Q0.a.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f11589a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i7 = bundle.getInt("dialog.intent.type");
        this.f11590b.b("requestAndShowDialog(%s, %s)", this.f11591c, Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11589a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f11589a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f11590b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f11589a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e7) {
            return Tasks.forException(new IntegrityServiceException(-13, e7));
        }
    }
}
