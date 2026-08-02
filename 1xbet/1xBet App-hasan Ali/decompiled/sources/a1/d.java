package a1;

import i4.InterfaceC2015a;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: m, reason: collision with root package name */
    public static final d f6388m = new d(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final d f6389n = new d(0, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final d f6390o = new d(0, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6391l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i5) {
        super(i);
        this.f6391l = i5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f6391l) {
        }
        return UUID.randomUUID();
    }
}
