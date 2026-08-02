package Oe;

import Le.InterfaceC3583a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC3682a<Element, Collection, Builder> implements InterfaceC3583a<Collection> {
    @NotNull
    protected abstract Iterator<Element> d(Collection collection);

    protected abstract int e(Collection collection);
}
