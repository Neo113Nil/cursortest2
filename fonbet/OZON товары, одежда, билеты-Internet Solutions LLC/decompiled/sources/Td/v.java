package Td;

/* loaded from: classes10.dex */
public final class v extends RuntimeException {
    public v() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final j a() {
        return new j(getMessage());
    }
}
