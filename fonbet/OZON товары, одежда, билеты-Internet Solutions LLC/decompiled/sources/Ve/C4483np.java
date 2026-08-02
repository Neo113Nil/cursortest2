package Ve;

import N4.b;
import Sc.InterfaceC4008j;
import Sc.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import spay.seamlessAuth.core.data.model.entity.AppTokenEntity;

/* renamed from: Ve.np, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4483np implements H6, In {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31685a;

    /* renamed from: b, reason: collision with root package name */
    public final C4371k0 f31686b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31687c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f31688d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4008j f31689e;

    public C4483np(Context context, C4371k0 sessionStoreSP) {
        Object a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionStoreSP, "sessionStoreSP");
        this.f31685a = context;
        this.f31686b = sessionStoreSP;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            b.a aVar = new b.a(context);
            aVar.b(b.EnumC0359b.AES256_GCM);
            a11 = aVar.a();
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        this.f31687c = a11;
        this.f31688d = He.g.a(this, this.f31685a, 0, new No(this));
        this.f31689e = Sc.k.b(C4424lo.f31539b);
    }

    @Override // Ve.H6
    public final SharedPreferences a(int i11, Function0 function0, Context context) {
        return He.g.a(this, context, i11, function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006a, code lost:
    
        if (r9 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4393km b() {
        Object a11;
        AppTokenEntity appTokenEntity;
        Object a12;
        ReentrantReadWriteLock.ReadLock readLock = ((ReentrantReadWriteLock) this.f31689e.getValue()).readLock();
        readLock.lock();
        try {
            SharedPreferences sharedPreferences = this.f31688d;
            String string = sharedPreferences != null ? sharedPreferences.getString("sid_app_token", null) : null;
            readLock.unlock();
            if (string != null) {
                try {
                    r.Companion companion = Sc.r.INSTANCE;
                    a11 = G9.f29065a.d(string, AppTokenEntity.class);
                } catch (Throwable th2) {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    a11 = Sc.s.a(th2);
                }
                boolean z11 = a11 instanceof r.b;
                Object obj = z11 ? null : a11;
                if (z11 || obj == null) {
                    Log.w("PARSER", "Gson couldn't deserialize " + AppTokenEntity.class + " - " + string + " \nCause: " + Sc.r.b(a11));
                }
                appTokenEntity = (AppTokenEntity) obj;
            }
            C4371k0 c4371k0 = this.f31686b;
            ((ReentrantReadWriteLock) c4371k0.f31408d.getValue()).readLock().lock();
            try {
                SharedPreferences sharedPreferences2 = c4371k0.f31407c;
                String string2 = sharedPreferences2 != null ? sharedPreferences2.getString(M1.b.m("63324a6c636c39705a46396863484266644739725a57343d"), null) : null;
                if (string2 != null) {
                    try {
                        r.Companion companion3 = Sc.r.INSTANCE;
                        a12 = G9.f29065a.d(string2, AppTokenEntity.class);
                    } catch (Throwable th3) {
                        r.Companion companion4 = Sc.r.INSTANCE;
                        a12 = Sc.s.a(th3);
                    }
                    boolean z12 = a12 instanceof r.b;
                    Object obj2 = z12 ? null : a12;
                    if (z12 || obj2 == null) {
                        Log.w("PARSER", "Gson couldn't deserialize " + AppTokenEntity.class + " - " + string2 + " \nCause: " + Sc.r.b(a12));
                    }
                    appTokenEntity = (AppTokenEntity) obj2;
                } else {
                    appTokenEntity = null;
                }
                if (appTokenEntity == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(appTokenEntity, "<this>");
                return new C4393km(appTokenEntity.getToken(), appTokenEntity.getExpiresTime(), appTokenEntity.getTypeAuth());
            } finally {
            }
        } finally {
        }
    }

    @Override // Ve.H6
    public final String a() {
        return "at_store";
    }
}
