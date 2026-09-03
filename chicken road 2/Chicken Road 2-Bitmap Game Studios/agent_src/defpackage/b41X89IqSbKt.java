package defpackage;

import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentDialog;
import androidx.activity.FullyDrawnReporter;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.window.layout.WindowLayoutInfo;
import kotlin.collections.EmptyList;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class b41X89IqSbKt implements Runnable {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ b41X89IqSbKt(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.oyjLVtGms9eZwJ0;
        Object obj = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                int i2 = AbstractComposeView.uypNJrpDByoB;
                ((AbstractComposeView) obj).ra306ClFT3HT();
                return;
            case 1:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) obj;
                MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.mFNFvFv0Eiyk;
                Trace.beginSection("measureAndLayout");
                try {
                    androidComposeViewAccessibilityDelegateCompat.i7xAcZoXXiIt.yzPsTade5rL7D3(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        androidComposeViewAccessibilityDelegateCompat.FsuUJlzzWhYnMlD();
                        Trace.endSection();
                        androidComposeViewAccessibilityDelegateCompat.GDGFDp2lxiHY = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                ActionMode actionMode = ((AndroidTextContextMenuToolbarProvider) obj).Uo5pffGf8LUU;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 3:
                ComponentDialog.b41X89IqSbKt((ComponentDialog) obj);
                return;
            case 4:
                ((Consumer) obj).accept(new WindowLayoutInfo(EmptyList.oyjLVtGms9eZwJ0));
                return;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                FullyDrawnReporter fullyDrawnReporter = (FullyDrawnReporter) obj;
                synchronized (fullyDrawnReporter.ra306ClFT3HT) {
                    if (!fullyDrawnReporter.oyjLVtGms9eZwJ0) {
                        fullyDrawnReporter.hRNgd2zGCE5kj.hRNgd2zGCE5kj();
                        fullyDrawnReporter.yzPsTade5rL7D3();
                    }
                }
                return;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) obj;
                LifecycleRegistry lifecycleRegistry = processLifecycleOwner.FsuUJlzzWhYnMlD;
                if (processLifecycleOwner.b41X89IqSbKt == 0) {
                    processLifecycleOwner.gmXBnHsR2YSm = true;
                    lifecycleRegistry.gmXBnHsR2YSm(Lifecycle.Event.ON_PAUSE);
                }
                if (processLifecycleOwner.oyjLVtGms9eZwJ0 == 0 && processLifecycleOwner.gmXBnHsR2YSm) {
                    lifecycleRegistry.gmXBnHsR2YSm(Lifecycle.Event.ON_STOP);
                    processLifecycleOwner.i7xAcZoXXiIt = true;
                    return;
                }
                return;
            case 7:
                RippleHostView.setRippleState$lambda$1((RippleHostView) obj);
                return;
            default:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
        }
    }
}
