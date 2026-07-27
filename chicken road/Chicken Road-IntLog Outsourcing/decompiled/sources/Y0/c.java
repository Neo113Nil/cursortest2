package Y0;

/* loaded from: classes.dex */
public enum c implements U1.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f3675a;

    c(int i2) {
        this.f3675a = i2;
    }

    @Override // U1.c
    public final int getNumber() {
        return this.f3675a;
    }
}
