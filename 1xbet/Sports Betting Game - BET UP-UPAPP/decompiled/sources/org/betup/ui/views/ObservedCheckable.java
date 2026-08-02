package org.betup.ui.views;

import android.widget.Checkable;
import kotlin.Metadata;

/* compiled from: ObservedCheckable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/views/ObservedCheckable;", "Landroid/widget/Checkable;", "checkedChangeListener", "Lorg/betup/ui/views/CheckedChangeListener;", "getCheckedChangeListener", "()Lorg/betup/ui/views/CheckedChangeListener;", "setCheckedChangeListener", "(Lorg/betup/ui/views/CheckedChangeListener;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ObservedCheckable extends Checkable {
    CheckedChangeListener getCheckedChangeListener();

    void setCheckedChangeListener(CheckedChangeListener checkedChangeListener);
}
