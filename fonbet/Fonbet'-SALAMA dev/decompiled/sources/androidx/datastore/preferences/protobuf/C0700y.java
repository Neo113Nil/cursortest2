package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0700y extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9257a;

    public static C0700y a() {
        return new C0700y("Protocol message had invalid UTF-8.");
    }

    public static C0699x b() {
        return new C0699x("Protocol message tag had invalid wire type.");
    }

    public static C0700y c() {
        return new C0700y("CodedInputStream encountered a malformed varint.");
    }

    public static C0700y d() {
        return new C0700y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0700y e() {
        return new C0700y("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
