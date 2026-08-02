package androidx.compose.ui.util;

@kotlin.Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u001f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0001\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001aE\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u000f\u001aA\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aK\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aQ\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001b\u0010\u0012\u001a_\u0010\u001f\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0010\b\u0002\u0010\u001d*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00028\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b!\u0010\u0012\u001aE\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010\u0019\u001ag\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\u0010\n\u0006\b\u0001\u0012\u0002\u0010\u0001\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b#\u0010$\u001aX\u0010(\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00028\u00012\u001d\u0010'\u001a\u0019\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b(\u0010)\u001aV\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010\u0017\u001a\u0019\u0012\t\u0012\u00070\t¢\u0006\u0002\b&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b*\u0010+\u001aX\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001f\u0010\u0017\u001a\u001b\u0012\t\u0012\u00070\t¢\u0006\u0002\b&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010+\u001aQ\u0010-\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b-\u0010.\u001aW\u00100\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010/\u001a\u00028\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b0\u00101\u001aQ\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b2\u0010+\u001aT\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u00103\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u001d\u0010'\u001a\u0019\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b4\u00105\u001ao\u00108\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u00106*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\"\u0010\u0017\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b&\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b&\u0012\u0004\u0012\u00028\u00020\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b8\u00109\u001aM\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0019\u001ag\u0010B\u001a\u00020A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020\t2\b\b\u0002\u0010@\u001a\u00020;2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020;\u0018\u00010\u0002¢\u0006\u0004\bB\u0010C\u001aK\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010D*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bE\u0010\u0019\u001aQ\u0010F\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bF\u0010\u0012\u001aQ\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010G0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bH\u0010\u0019\u001a)\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020I*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\bJ\u0010K\u001a?\u0010L\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bL\u0010\u0012\u001as\u0010W\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010O*\u00060Mj\u0002`N*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010P\u001a\u00028\u00012\u0006\u0010Q\u001a\u00020;2\u0006\u0010R\u001a\u00020;2\u0006\u0010S\u001a\u00020;2\u0006\u0010T\u001a\u00020\t2\u0006\u0010U\u001a\u00020;2\u0014\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020;\u0018\u00010\u0002H\u0002¢\u0006\u0004\bW\u0010X\u001a;\u0010Y\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00060Mj\u0002`N2\u0006\u0010P\u001a\u00028\u00002\u0014\u0010Q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020;\u0018\u00010\u0002H\u0002¢\u0006\u0004\bY\u0010Z\u001a\u0017\u0010]\u001a\u00020\\2\u0006\u0010[\u001a\u00020AH\u0000¢\u0006\u0004\b]\u0010^\u001a\u0017\u0010_\u001a\u00020\u00032\u0006\u0010[\u001a\u00020AH\u0000¢\u0006\u0004\b_\u0010`"}, d2 = {"T", "", "Lkotlin/Function1;", "", "action", "fastForEach", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "fastForEachReversed", "Lkotlin/Function2;", "", "fastForEachIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "", "predicate", "fastAll", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z", "fastAny", "fastFirstOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "selector", "fastSumBy", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "transform", "fastMap", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "fastMaxBy", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "destination", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastLastOrNull", "fastFilter", "fastFilteredMap", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "initial", "Lkotlin/ParameterName;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fastFold", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastMapIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "fastMapIndexedNotNull", "fastMaxOfOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "defaultValue", "fastMaxOfOrDefault", "(Ljava/util/List;Ljava/lang/Comparable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastZipWithNext", "S", "fastReduce", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "V", "other", "fastZip", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "fastMapNotNull", "", "separator", "prefix", "postfix", "limit", "truncated", "", "fastJoinToString", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "K", "fastDistinctBy", "fastMinByOrNull", "", "fastFlatMap", "", "fastFilterNotNull", "(Ljava/util/List;)Ljava/util/List;", "fastFirst", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "A", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "Camera2StreamConfigurationMap", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "getHighSpeedVideoSizes", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "message", "", "throwNoSuchElementException", "(Ljava/lang/String;)Ljava/lang/Void;", "throwUnsupportedOperationException", "(Ljava/lang/String;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListUtilsKt {
    public static final <T> void fastForEach(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }

    public static final <T> void fastForEachReversed(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            function1.invoke(list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public static final <T> void fastForEachIndexed(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> function2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function2.invoke(java.lang.Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T, R> java.util.List<R> fastMap(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(function1.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R extends java.lang.Comparable<? super R>> T fastMaxBy(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        R invoke = function1.invoke(t);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                T t2 = list.get(i);
                R invoke2 = function1.invoke(t2);
                if (invoke.compareTo(invoke2) < 0) {
                    t = t2;
                    invoke = invoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (T) t;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    public static final <T> T fastLastOrNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            T t = list.get(size);
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public static final <T> java.util.List<T> fastFilter(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R> java.util.List<R> fastFilteredMap(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super T, ? extends R> function12) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (function1.invoke(t).booleanValue()) {
                arrayList.add(function12.invoke(t));
            }
        }
        return arrayList;
    }

    public static final <T, R> java.util.List<R> fastMapIndexed(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> function2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(function2.invoke(java.lang.Integer.valueOf(i), list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> java.util.List<R> fastMapIndexedNotNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> function2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            R invoke = function2.invoke(java.lang.Integer.valueOf(i), list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R extends java.lang.Comparable<? super R>> R fastMaxOfOrNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        R invoke = function1.invoke(list.get(0));
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                R invoke2 = function1.invoke(list.get(i));
                if (invoke2.compareTo(invoke) > 0) {
                    invoke = invoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return invoke;
    }

    public static final <T, R extends java.lang.Comparable<? super R>> R fastMaxOfOrDefault(java.util.List<? extends T> list, R r, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return r;
        }
        R invoke = function1.invoke(list.get(0));
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                R invoke2 = function1.invoke(list.get(i));
                if (invoke2.compareTo(invoke) > 0) {
                    invoke = invoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return invoke;
    }

    public static final <T, R> java.util.List<R> fastZipWithNext(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() <= 1) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        amex.AMEXKernel aMEXKernel = list.get(0);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        while (i < lastIndex) {
            i++;
            T t = list.get(i);
            arrayList.add(function2.invoke(aMEXKernel, t));
            aMEXKernel = t;
        }
        return arrayList;
    }

    public static final <S, T extends S> S fastReduce(java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super S, ? super T, ? extends S> function2) {
        if (list.isEmpty()) {
            throwUnsupportedOperationException("Empty collection can't be reduced.");
        }
        S s = (S) kotlin.collections.CollectionsKt.first((java.util.List) list);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                s = function2.invoke(s, list.get(i));
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return s;
    }

    public static final <T, R, V> java.util.List<V> fastZip(java.util.List<? extends T> list, java.util.List<? extends R> list2, kotlin.jvm.functions.Function2<? super T, ? super R, ? extends V> function2) {
        int min = java.lang.Math.min(list.size(), list2.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(function2.invoke(list.get(i), list2.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> java.util.List<R> fastMapNotNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            R invoke = function1.invoke(list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ java.lang.String fastJoinToString$default(java.util.List list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        java.lang.CharSequence charSequence5 = charSequence2;
        if ((i2 & 4) != 0) {
        }
        java.lang.CharSequence charSequence6 = charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static final <T> java.lang.String fastJoinToString(java.util.List<? extends T> list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> function1) {
        return ((java.lang.StringBuilder) Camera2StreamConfigurationMap(list, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static final <T, K> java.util.List<T> fastDistinctBy(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        androidx.collection.MutableScatterSet mutableScatterSet = new androidx.collection.MutableScatterSet(list.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (mutableScatterSet.add(function1.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R extends java.lang.Comparable<? super R>> T fastMinByOrNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        R invoke = function1.invoke(t);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                T t2 = list.get(i);
                R invoke2 = function1.invoke(t2);
                if (invoke.compareTo(invoke2) > 0) {
                    t = t2;
                    invoke = invoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (T) t;
    }

    public static final <T, R> java.util.List<R> fastFlatMap(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kotlin.collections.CollectionsKt.addAll(arrayList, function1.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T> java.util.List<T> fastFilterNotNull(java.util.List<? extends T> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static final <T, A extends java.lang.Appendable> A Camera2StreamConfigurationMap(java.util.List<? extends T> list, A a2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> function1) {
        a2.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            getHighSpeedVideoSizes(a2, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void getHighSpeedVideoSizes(java.lang.Appendable appendable, T t, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> function1) {
        if (function1 != null) {
            appendable.append(function1.invoke(t));
            return;
        }
        if (t == 0 || (t instanceof java.lang.CharSequence)) {
            appendable.append((java.lang.CharSequence) t);
        } else if (t instanceof java.lang.Character) {
            appendable.append(((java.lang.Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    public static final java.lang.Void throwNoSuchElementException(java.lang.String str) {
        throw new java.util.NoSuchElementException(str);
    }

    public static final void throwUnsupportedOperationException(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(str);
    }

    public static final <T> boolean fastAll(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!function1.invoke(list.get(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (function1.invoke(list.get(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirstOrNull(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <T> int fastSumBy(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> function1) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += function1.invoke(list.get(i2)).intValue();
        }
        return i;
    }

    public static final <T, R, C extends java.util.Collection<? super R>> C fastMapTo(java.util.List<? extends T> list, C c, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(function1.invoke(list.get(i)));
        }
        return c;
    }

    public static final <T, R> R fastFold(java.util.List<? extends T> list, R r, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> function2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = function2.invoke(r, list.get(i));
        }
        return r;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirst(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }
}
