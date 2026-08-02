package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.core.view.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5310c0 implements Sequence<View> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f42275a;

    C5310c0(ViewGroup viewGroup) {
        this.f42275a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<View> iterator() {
        return new C5314e0(this.f42275a);
    }
}
