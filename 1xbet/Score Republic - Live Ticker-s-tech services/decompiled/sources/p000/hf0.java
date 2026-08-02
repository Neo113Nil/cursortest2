package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class hf0 extends IOException {

    /* JADX INFO: renamed from: j */
    public boolean f3197j;

    /* JADX INFO: renamed from: a */
    public static hf0 m2258a() {
        return new hf0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static ff0 m2259b() {
        return new ff0("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: c */
    public static hf0 m2260c() {
        return new hf0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static hf0 m2261d() {
        return new hf0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: e */
    public static hf0 m2262e() {
        return new hf0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
