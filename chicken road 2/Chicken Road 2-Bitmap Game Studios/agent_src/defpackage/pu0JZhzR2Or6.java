package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalFullyDrawnReporterOwner;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.material3.AlertDialogKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DefaultBasicAlertDialogOverride;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.HostDefaultProviderKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.Dp;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.CharDirectionality;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class pu0JZhzR2Or6 implements Function0 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ pu0JZhzR2Or6(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        Class<?> returnType;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i) {
            case 0:
                PaddingValuesImpl paddingValuesImpl = AlertDialogKt.yzPsTade5rL7D3;
                return DefaultBasicAlertDialogOverride.yzPsTade5rL7D3;
            case 1:
                throw null;
            case 2:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AppBarKt.yzPsTade5rL7D3;
                return DefaultSingleRowTopAppBarOverride.yzPsTade5rL7D3;
            case 3:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = AppBarKt.yzPsTade5rL7D3;
                return DefaultTwoRowsTopAppBarOverride.yzPsTade5rL7D3;
            case 4:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal3 = AutofillHighlightKt.yzPsTade5rL7D3;
                return new SolidColor(ColorKt.hRNgd2zGCE5kj(1308617531));
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = BasicText_androidKt.yzPsTade5rL7D3;
                return null;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                throw null;
            case 7:
                throw null;
            case 8:
                List list = CharDirectionality.i7xAcZoXXiIt;
                int b41X89IqSbKt = MapsKt.b41X89IqSbKt(CollectionsKt.NIabVTHf6LMJyXq(list, 10));
                if (b41X89IqSbKt < 16) {
                    b41X89IqSbKt = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(b41X89IqSbKt);
                Iterator it = ((AbstractList) list).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(Integer.valueOf(((CharDirectionality) next).oyjLVtGms9eZwJ0), next);
                }
                return linkedHashMap;
            case 9:
                return ColorSchemeKt.b41X89IqSbKt(0L, 0L, 0L, 0L, -1);
            case 10:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ColorSchemeKt.yzPsTade5rL7D3;
                return Boolean.TRUE;
            case 11:
                return unit;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = CompositionErrorContextKt.yzPsTade5rL7D3;
                return null;
            case 13:
                throw OcGJUxcOVecQiKb.XrorSzThrtvJ4A("Unexpected call to default provider");
            case 14:
                return Float.valueOf(0.0f);
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                return Float.valueOf(1.0f);
            case 16:
                return Boolean.TRUE;
            case 17:
                float f = DragGestureDetectorKt.yzPsTade5rL7D3;
                return Boolean.TRUE;
            case 18:
                float f2 = DragGestureDetectorKt.yzPsTade5rL7D3;
                return unit;
            case 19:
                String[] strArr = FrameworkSQLiteDatabase.b41X89IqSbKt;
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 20:
                try {
                    String[] strArr2 = FrameworkSQLiteDatabase.b41X89IqSbKt;
                    Method method = (Method) FrameworkSQLiteDatabase.gmXBnHsR2YSm.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 21:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal4 = HostDefaultProviderKt.yzPsTade5rL7D3;
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 22:
                Lazy lazy = ImmLeaksCleaner.oyjLVtGms9eZwJ0;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new ImmLeaksCleaner.ValidCleaner();
                } catch (NoSuchFieldException unused3) {
                    return ImmLeaksCleaner.FailedInitialization.yzPsTade5rL7D3;
                }
            case 23:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = InspectionTablesKt.yzPsTade5rL7D3;
                return null;
            case 24:
                HorizontalAlignmentLine horizontalAlignmentLine = InteractiveComponentSizeKt.yzPsTade5rL7D3;
                return Boolean.TRUE;
            case 25:
                HorizontalAlignmentLine horizontalAlignmentLine2 = InteractiveComponentSizeKt.yzPsTade5rL7D3;
                return new Dp(48.0f);
            case 26:
            case 27:
                return unit;
            case 28:
                int i2 = LocalActivityResultRegistryOwner.yzPsTade5rL7D3;
                return null;
            default:
                int i3 = LocalFullyDrawnReporterOwner.yzPsTade5rL7D3;
                return null;
        }
    }

    public /* synthetic */ pu0JZhzR2Or6(InvalidationTracker invalidationTracker, int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }
}
