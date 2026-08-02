package E5;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import io.sentry.SentryBaseEvent;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.AbstractC1464a;

/* renamed from: E5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0183a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f2348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f2349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A5.h f2350c;

    public /* synthetic */ C0183a(AtomicBoolean atomicBoolean, HashMap hashMap, A5.h hVar) {
        this.f2348a = atomicBoolean;
        this.f2349b = hashMap;
        this.f2350c = hVar;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        AtomicBoolean atomicBoolean = this.f2348a;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        FirebaseUser firebaseUser = firebaseAuth.f11854f;
        HashMap hashMap = this.f2349b;
        if (firebaseUser == null) {
            hashMap.put(SentryBaseEvent.JsonKeys.USER, null);
        } else {
            hashMap.put(SentryBaseEvent.JsonKeys.USER, AbstractC1464a.H(AbstractC1464a.L(firebaseUser)));
        }
        this.f2350c.c(hashMap);
    }
}
