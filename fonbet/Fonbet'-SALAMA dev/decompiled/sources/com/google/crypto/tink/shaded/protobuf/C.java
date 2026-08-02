package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class C extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11704a;

    public static C a() {
        return new C("Protocol message contained an invalid tag (zero).");
    }

    public static C b() {
        return new C("Protocol message had invalid UTF-8.");
    }

    public static B c() {
        return new B("Protocol message tag had invalid wire type.");
    }

    public static C d() {
        return new C("CodedInputStream encountered a malformed varint.");
    }

    public static C e() {
        return new C("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C f() {
        return new C("Failed to parse the message.");
    }

    public static C g() {
        return new C("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
