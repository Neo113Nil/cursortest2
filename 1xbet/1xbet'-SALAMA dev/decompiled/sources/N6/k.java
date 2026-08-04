package N6;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f4816a = new j(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f4818c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4817b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i7 = 0; i7 < iHighestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f4818c = atomicReferenceArr;
    }

    public static final void a(j jVar) {
        t6.h.e(jVar, "segment");
        if (jVar.f4814f != null || jVar.f4815g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (jVar.f4812d) {
            return;
        }
        AtomicReference atomicReference = f4818c[(int) (Thread.currentThread().getId() & (((long) f4817b) - 1))];
        j jVar2 = f4816a;
        j jVar3 = (j) atomicReference.getAndSet(jVar2);
        if (jVar3 == jVar2) {
            return;
        }
        int i7 = jVar3 != null ? jVar3.f4811c : 0;
        if (i7 >= 65536) {
            atomicReference.set(jVar3);
            return;
        }
        jVar.f4814f = jVar3;
        jVar.f4810b = 0;
        jVar.f4811c = i7 + 8192;
        atomicReference.set(jVar);
    }

    public static final j b() {
        AtomicReference atomicReference = f4818c[(int) (Thread.currentThread().getId() & (((long) f4817b) - 1))];
        j jVar = f4816a;
        j jVar2 = (j) atomicReference.getAndSet(jVar);
        if (jVar2 == jVar) {
            return new j();
        }
        if (jVar2 == null) {
            atomicReference.set(null);
            return new j();
        }
        atomicReference.set(jVar2.f4814f);
        jVar2.f4814f = null;
        jVar2.f4811c = 0;
        return jVar2;
    }
}
