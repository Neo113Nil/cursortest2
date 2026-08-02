package androidx.work;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private UUID f45552a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private a f45553b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private e f45554c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private HashSet f45555d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private e f45556e;

    /* renamed from: f, reason: collision with root package name */
    private int f45557f;

    /* renamed from: g, reason: collision with root package name */
    private final int f45558g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a BLOCKED;
        public static final a CANCELLED;
        public static final a ENQUEUED;
        public static final a FAILED;
        public static final a RUNNING;
        public static final a SUCCEEDED;

        static {
            a aVar = new a("ENQUEUED", 0);
            ENQUEUED = aVar;
            a aVar2 = new a("RUNNING", 1);
            RUNNING = aVar2;
            a aVar3 = new a("SUCCEEDED", 2);
            SUCCEEDED = aVar3;
            a aVar4 = new a("FAILED", 3);
            FAILED = aVar4;
            a aVar5 = new a("BLOCKED", 4);
            BLOCKED = aVar5;
            a aVar6 = new a("CANCELLED", 5);
            CANCELLED = aVar6;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public v(@NonNull UUID uuid, @NonNull a aVar, @NonNull e eVar, @NonNull ArrayList arrayList, @NonNull e eVar2, int i11, int i12) {
        this.f45552a = uuid;
        this.f45553b = aVar;
        this.f45554c = eVar;
        this.f45555d = new HashSet(arrayList);
        this.f45556e = eVar2;
        this.f45557f = i11;
        this.f45558g = i12;
    }

    @NonNull
    public final HashSet a() {
        return this.f45555d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f45557f == vVar.f45557f && this.f45558g == vVar.f45558g && this.f45552a.equals(vVar.f45552a) && this.f45553b == vVar.f45553b && this.f45554c.equals(vVar.f45554c) && this.f45555d.equals(vVar.f45555d)) {
            return this.f45556e.equals(vVar.f45556e);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f45556e.hashCode() + ((this.f45555d.hashCode() + ((this.f45554c.hashCode() + ((this.f45553b.hashCode() + (this.f45552a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f45557f) * 31) + this.f45558g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f45552a + "', mState=" + this.f45553b + ", mOutputData=" + this.f45554c + ", mTags=" + this.f45555d + ", mProgress=" + this.f45556e + '}';
    }
}
