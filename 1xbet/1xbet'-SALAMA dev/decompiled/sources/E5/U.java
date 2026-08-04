package E5;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import io.sentry.SentryBaseEvent;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f2333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f2334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A5.h f2335c;

    public /* synthetic */ U(AtomicBoolean atomicBoolean, HashMap map, A5.h hVar) {
        this.f2333a = atomicBoolean;
        this.f2334b = map;
        this.f2335c = hVar;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        AtomicBoolean atomicBoolean = this.f2333a;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        FirebaseUser firebaseUser = firebaseAuth.f11854f;
        HashMap map = this.f2334b;
        if (firebaseUser == null) {
            map.put(SentryBaseEvent.JsonKeys.USER, null);
        } else {
            map.put(SentryBaseEvent.JsonKeys.USER, p097n3.a.H(p097n3.a.L(firebaseUser)));
        }
        this.f2335c.c(map);
    }
}
