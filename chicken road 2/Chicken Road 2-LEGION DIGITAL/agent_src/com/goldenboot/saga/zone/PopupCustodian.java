package com.goldenboot.saga.zone;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/goldenboot/saga/zone/PopupCustodian;", "Lcom/goldenboot/saga/zone/SnackbarBenchmark;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "evictLayout", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class PopupCustodian implements SnackbarBenchmark {
    public static final PopupCustodian growPayload = new PopupCustodian();

    private PopupCustodian() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        r8 = com.goldenboot.saga.zone.IndicatorSource.clipOrigin(r0);
     */
    @Override // com.goldenboot.saga.zone.SnackbarBenchmark
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rect evictLayout(Activity activity) {
        DisplayCutout clipOrigin;
        int flushSample;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            IndicatorSource.updateTimer(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            flushSample = IndicatorSource.flushSample(activity);
            int i = rect.bottom;
            if (i + flushSample == point.y) {
                rect.bottom = i + flushSample;
            } else {
                int i2 = rect.right;
                if (i2 + flushSample == point.x) {
                    rect.right = i2 + flushSample;
                } else if (rect.left == flushSample) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && clipOrigin != null) {
            if (rect.left == clipOrigin.getSafeInsetLeft()) {
                rect.left = 0;
            }
            if (point.x - rect.right == clipOrigin.getSafeInsetRight()) {
                rect.right += clipOrigin.getSafeInsetRight();
            }
            if (rect.top == clipOrigin.getSafeInsetTop()) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == clipOrigin.getSafeInsetBottom()) {
                rect.bottom += clipOrigin.getSafeInsetBottom();
            }
        }
        return rect;
    }
}
