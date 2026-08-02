package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class X1 implements Sequence<W1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f40779a = new ArrayList();

    public final void b(Object obj, @NotNull String str) {
        this.f40779a.add(new W1(str, obj));
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<W1> iterator() {
        return this.f40779a.iterator();
    }
}
