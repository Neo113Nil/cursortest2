package Z1;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f7842a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7843b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7844c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7845d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7846e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7847f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7848g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7849h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7850i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7851k;

    public d(long j, boolean z4, boolean z7, boolean z8, ArrayList arrayList, long j3, boolean z9, long j7, int i7, int i8, int i9) {
        this.f7842a = j;
        this.f7843b = z4;
        this.f7844c = z7;
        this.f7845d = z8;
        this.f7847f = Collections.unmodifiableList(arrayList);
        this.f7846e = j3;
        this.f7848g = z9;
        this.f7849h = j7;
        this.f7850i = i7;
        this.j = i8;
        this.f7851k = i9;
    }

    public d(Parcel parcel) {
        this.f7842a = parcel.readLong();
        this.f7843b = parcel.readByte() == 1;
        this.f7844c = parcel.readByte() == 1;
        this.f7845d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new c(parcel.readInt(), parcel.readLong()));
        }
        this.f7847f = Collections.unmodifiableList(arrayList);
        this.f7846e = parcel.readLong();
        this.f7848g = parcel.readByte() == 1;
        this.f7849h = parcel.readLong();
        this.f7850i = parcel.readInt();
        this.j = parcel.readInt();
        this.f7851k = parcel.readInt();
    }
}
