package E5;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.internal.zzao;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class W implements A5.i {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final HashMap f2337B = new HashMap();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public A5.h f2338A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f2339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseAuth f2340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PhoneMultiFactorInfo f2342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B1.f f2344f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MultiFactorSession f2345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f2346y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Integer f2347z;

    public W(p121q5.c cVar, C0197o c0197o, T t7, MultiFactorSession multiFactorSession, PhoneMultiFactorInfo phoneMultiFactorInfo, B1.f fVar) {
        AtomicReference atomicReference = new AtomicReference(null);
        this.f2339a = atomicReference;
        atomicReference.set(cVar);
        this.f2345x = multiFactorSession;
        this.f2342d = phoneMultiFactorInfo;
        this.f2340b = C0188f.b(c0197o);
        this.f2341c = t7.f2327a;
        this.f2343e = Math.toIntExact(t7.f2328b.longValue());
        String str = t7.f2330d;
        if (str != null) {
            this.f2346y = str;
        }
        Long l7 = t7.f2329c;
        if (l7 != null) {
            this.f2347z = Integer.valueOf(Math.toIntExact(l7.longValue()));
        }
        this.f2344f = fVar;
    }

    @Override // A5.i
    public final void b() {
        this.f2338A = null;
        this.f2339a.set(null);
    }

    @Override // A5.i
    public final void c(Object obj, A5.h hVar) {
        PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken;
        this.f2338A = hVar;
        V v6 = new V(this);
        String str = this.f2346y;
        String str2 = this.f2341c;
        FirebaseAuth firebaseAuth = this.f2340b;
        if (str != null) {
            G4.A a2 = firebaseAuth.f11855g;
            a2.f2873c = str2;
            a2.f2874d = str;
        }
        com.google.android.gms.common.internal.D.i(firebaseAuth);
        Activity activity = (Activity) this.f2339a.get();
        String str3 = str2 != null ? str2 : null;
        MultiFactorSession multiFactorSession = this.f2345x;
        MultiFactorSession multiFactorSession2 = multiFactorSession != null ? multiFactorSession : null;
        PhoneMultiFactorInfo phoneMultiFactorInfo = this.f2342d;
        PhoneMultiFactorInfo phoneMultiFactorInfo2 = phoneMultiFactorInfo != null ? phoneMultiFactorInfo : null;
        long jConvert = TimeUnit.SECONDS.convert(this.f2343e, TimeUnit.MILLISECONDS);
        Long lValueOf = Long.valueOf(jConvert);
        Integer num = this.f2347z;
        PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken2 = (num == null || (phoneAuthProvider$ForceResendingToken = (PhoneAuthProvider$ForceResendingToken) f2337B.get(num)) == null) ? null : phoneAuthProvider$ForceResendingToken;
        if (jConvert < 0 || jConvert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        if (multiFactorSession2 == null) {
            com.google.android.gms.common.internal.D.f(str3, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
            com.google.android.gms.common.internal.D.a("A phoneMultiFactorInfo must be set for second factor sign-in.", phoneMultiFactorInfo2 == null);
        } else if (((zzao) multiFactorSession2).f11925a != null) {
            com.google.android.gms.common.internal.D.e(str3);
            com.google.android.gms.common.internal.D.a("Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.", phoneMultiFactorInfo2 == null);
        } else {
            com.google.android.gms.common.internal.D.a("A phoneMultiFactorInfo must be set for second factor sign-in.", phoneMultiFactorInfo2 != null);
            com.google.android.gms.common.internal.D.a("A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.", str3 == null);
        }
        FirebaseAuth.l(new p034e4.l(firebaseAuth, lValueOf, v6, firebaseAuth.f11847A, str3, activity, phoneAuthProvider$ForceResendingToken2, multiFactorSession2, phoneMultiFactorInfo2));
    }
}
