package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class if0 extends IOException {

    /* JADX INFO: renamed from: j */
    public boolean f3561j;

    /* JADX INFO: renamed from: a */
    public static if0 m2596a() {
        return new if0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static gf0 m2597b() {
        return new gf0("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: c */
    public static if0 m2598c() {
        return new if0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static if0 m2599d() {
        return new if0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: e */
    public static if0 m2600e() {
        return new if0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
