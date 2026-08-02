package p4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: p4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2269i extends C2275o {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18797c = AtomicIntegerFieldUpdater.newUpdater(C2269i.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2269i(C2268h c2268h, Throwable th, boolean z3) {
        super(th, z3);
        if (th == null) {
            th = new CancellationException("Continuation " + c2268h + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
