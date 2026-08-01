package com.inmobi.media;

import android.widget.ImageView;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* renamed from: com.inmobi.media.el, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3688el extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public List f7090a;
    public ImageView b;
    public Ref.BooleanRef c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3800il e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3688el(C3800il c3800il, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c3800il;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((List) null, (ImageView) null, this);
    }
}
