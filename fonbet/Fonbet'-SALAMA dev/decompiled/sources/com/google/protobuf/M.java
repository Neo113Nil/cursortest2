package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class M extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12124a;

    public static M a() {
        return new M("Protocol message end-group tag did not match expected tag.");
    }

    public static M b() {
        return new M("Protocol message contained an invalid tag (zero).");
    }

    public static M c() {
        return new M("Protocol message had invalid UTF-8.");
    }

    public static L d() {
        return new L("Protocol message tag had invalid wire type.");
    }

    public static M e() {
        return new M("CodedInputStream encountered a malformed varint.");
    }

    public static M f() {
        return new M("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static M g() {
        return new M("Failed to parse the message.");
    }

    public static M h() {
        return new M("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
