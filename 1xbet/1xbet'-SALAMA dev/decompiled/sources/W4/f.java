package W4;

import com.google.protobuf.H;

/* JADX INFO: loaded from: classes2.dex */
public enum f implements H {
    /* JADX INFO: Fake field, exist only in values array */
    QUERY_SCOPE_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION(1),
    COLLECTION_GROUP(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6738a;

    f(int i7) {
        this.f6738a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f6738a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
