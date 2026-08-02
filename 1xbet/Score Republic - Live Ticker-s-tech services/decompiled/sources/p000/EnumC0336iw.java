package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: iw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0336iw implements dz0 {

    /* JADX INFO: renamed from: j */
    public static final EnumC0336iw f3682j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0336iw[] f3683k;

    static {
        EnumC0336iw enumC0336iw = new EnumC0336iw("INSTANCE", 0);
        f3682j = enumC0336iw;
        f3683k = new EnumC0336iw[]{enumC0336iw, new EnumC0336iw("NEVER", 1)};
    }

    public static EnumC0336iw valueOf(String str) {
        return (EnumC0336iw) Enum.valueOf(EnumC0336iw.class, str);
    }

    public static EnumC0336iw[] values() {
        return (EnumC0336iw[]) f3683k.clone();
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return true;
    }

    @Override // p000.y71
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.y71
    public final Object poll() {
        return null;
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
    }

    @Override // p000.y71
    public final void clear() {
    }
}
