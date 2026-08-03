package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class A extends java.io.IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2213a;

    public static androidx.datastore.preferences.protobuf.A a() {
        return new androidx.datastore.preferences.protobuf.A("Protocol message had invalid UTF-8.");
    }

    public static androidx.datastore.preferences.protobuf.C0089z b() {
        return new androidx.datastore.preferences.protobuf.C0089z("Protocol message tag had invalid wire type.");
    }

    public static androidx.datastore.preferences.protobuf.A c() {
        return new androidx.datastore.preferences.protobuf.A("CodedInputStream encountered a malformed varint.");
    }

    public static androidx.datastore.preferences.protobuf.A d() {
        return new androidx.datastore.preferences.protobuf.A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static androidx.datastore.preferences.protobuf.A e() {
        return new androidx.datastore.preferences.protobuf.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
