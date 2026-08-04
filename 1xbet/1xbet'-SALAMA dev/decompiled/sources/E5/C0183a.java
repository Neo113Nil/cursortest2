package E5;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import io.sentry.SentryBaseEvent;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: E5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0183a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f2348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f2349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A5.h f2350c;

    public /* synthetic */ C0183a(AtomicBoolean atomicBoolean, HashMap map, A5.h hVar) {
        this.f2348a = atomicBoolean;
        this.f2349b = map;
        this.f2350c = hVar;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        AtomicBoolean atomicBoolean = this.f2348a;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        FirebaseUser firebaseUser = firebaseAuth.f11854f;
        HashMap map = this.f2349b;
        if (firebaseUser == null) {
            map.put(SentryBaseEvent.JsonKeys.USER, null);
        } else {
            map.put(SentryBaseEvent.JsonKeys.USER, p097n3.a.H(p097n3.a.L(firebaseUser)));
        }
        this.f2350c.c(map);
    }
}
