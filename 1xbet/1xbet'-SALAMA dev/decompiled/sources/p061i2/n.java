package p061i2;

import java.util.Collections;
import java.util.List;
import p012b2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13932c;

    public n(String str, List list, boolean z4) {
        this.f13930a = str;
        this.f13931b = Collections.unmodifiableList(list);
        this.f13932c = z4;
    }
}
