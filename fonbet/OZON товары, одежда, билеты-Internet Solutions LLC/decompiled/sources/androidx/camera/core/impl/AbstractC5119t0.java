package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.camera.core.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5119t0<C> {

    /* renamed from: a, reason: collision with root package name */
    private HashSet f38392a = new HashSet();

    public final void a(@NonNull List<C> list) {
        this.f38392a.addAll(list);
    }

    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5119t0<C> clone();

    @NonNull
    public final List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f38392a));
    }
}
