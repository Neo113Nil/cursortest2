package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5362h;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5361g extends AbstractC5362h.a {

    /* renamed from: a, reason: collision with root package name */
    private int f42517a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f42518b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5362h f42519c;

    C5361g(AbstractC5362h abstractC5362h) {
        this.f42519c = abstractC5362h;
        this.f42518b = abstractC5362h.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42517a < this.f42518b;
    }

    public final byte nextByte() {
        int i11 = this.f42517a;
        if (i11 >= this.f42518b) {
            throw new NoSuchElementException();
        }
        this.f42517a = i11 + 1;
        return this.f42519c.g(i11);
    }
}
