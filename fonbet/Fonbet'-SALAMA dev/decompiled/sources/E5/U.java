package E5;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import io.sentry.SentryBaseEvent;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final /* synthetic */ class U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f2333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f2334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A5.h f2335c;

    public /* synthetic */ U(AtomicBoolean atomicBoolean, HashMap hashMap, A5.h hVar) {
        this.f2333a = atomicBoolean;
        this.f2334b = hashMap;
        this.f2335c = hVar;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        AtomicBoolean atomicBoolean = this.f2333a;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        FirebaseUser firebaseUser = firebaseAuth.f11854f;
        HashMap hashMap = this.f2334b;
        if (firebaseUser == null) {
            hashMap.put(SentryBaseEvent.JsonKeys.USER, null);
        } else {
            hashMap.put(SentryBaseEvent.JsonKeys.USER, AbstractC1464a.H(AbstractC1464a.L(firebaseUser)));
        }
        this.f2335c.c(hashMap);
    }
}
