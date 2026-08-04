package p010b0;

import Y4.D;
import java.io.Serializable;
import java.util.Iterator;
import p077k6.c;

/* JADX INFO: renamed from: b0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0735f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f10034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f10035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10037d;

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f10036c = obj;
        this.f10037d |= Integer.MIN_VALUE;
        return D.a(null, null, this);
    }
}
