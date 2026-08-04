package io.sentry.android.replay.capture;

import s6.a;
import s6.o;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1 extends i implements a {
    final /* synthetic */ T $oldValue;
    final /* synthetic */ o $onChange;
    final /* synthetic */ String $propertyName;
    final /* synthetic */ T $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(o oVar, String str, T t7, T t8) {
        super(0);
        this.$onChange = oVar;
        this.$propertyName = str;
        this.$oldValue = t7;
        this.$value = t8;
    }

    @Override // s6.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m15invoke();
        return p044f6.i.f13014a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m15invoke() {
        this.$onChange.invoke(this.$propertyName, this.$oldValue, this.$value);
    }
}
