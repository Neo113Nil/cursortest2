package i2;

import b2.InterfaceC0779a;
import java.util.Collections;
import java.util.List;

/* renamed from: i2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1258n implements InterfaceC0779a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13924a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13925b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13926c;

    public AbstractC1258n(String str, List list, boolean z4) {
        this.f13924a = str;
        this.f13925b = Collections.unmodifiableList(list);
        this.f13926c = z4;
    }
}
