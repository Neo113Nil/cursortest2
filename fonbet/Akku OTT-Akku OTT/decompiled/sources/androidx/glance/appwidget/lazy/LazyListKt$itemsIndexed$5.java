package androidx.glance.appwidget.lazy;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke", "(I)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/glance/appwidget/lazy/LazyListKt$itemsIndexed$5\n*L\n1#1,316:1\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListKt$itemsIndexed$5 extends Lambda implements Function1<Integer, Long> {
    final /* synthetic */ Function2<Integer, T, Long> $itemId;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyListKt$itemsIndexed$5(Function2<? super Integer, ? super T, Long> function2, T[] tArr) {
        super(1);
        this.$itemId = function2;
        this.$items = tArr;
    }

    public final Long invoke(int i) {
        return this.$itemId.invoke(Integer.valueOf(i), this.$items[i]);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Long invoke(Integer num) {
        return invoke(num.intValue());
    }
}
