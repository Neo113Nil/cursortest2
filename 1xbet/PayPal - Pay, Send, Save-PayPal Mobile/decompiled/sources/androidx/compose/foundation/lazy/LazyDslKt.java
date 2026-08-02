package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a©\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042%\b\n\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062%\b\n\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000623\b\u0004\u0010\f\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0002\u0010\u0011\u001a\u0082\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042%\b\n\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u000623\b\u0004\u0010\f\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0002\u0010\u0012\u001aè\u0001\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042:\b\n\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\r2:\b\u0006\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\r2H\b\u0004\u0010\f\u001aB\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0002\u0010\u0017\u001a¬\u0001\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042:\b\n\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\r2H\b\u0004\u0010\f\u001aB\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0002\u0010\u0018\u001a©\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00192%\b\n\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062%\b\n\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000623\b\u0004\u0010\f\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0002\u0010\u001a\u001a\u0082\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00192%\b\n\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u000623\b\u0004\u0010\f\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0002\u0010\u001b\u001aè\u0001\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00192:\b\n\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\r2:\b\u0006\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\r2H\b\u0004\u0010\f\u001aB\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0002\u0010\u001c\u001a¬\u0001\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00192:\b\n\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\r2H\b\u0004\u0010\f\u001aB\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020&2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u00101\u001a\u0082\u0001\u00102\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020&2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u00107\u001av\u00102\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020&2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u00108\u001al\u00102\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010+\u001a\u00020,2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u00109\u001av\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020&2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010:\u001al\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010;¨\u0006<"}, d2 = {"items", "", "T", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "LazyRow", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyColumn", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyDslKt {
    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = androidx.compose.foundation.lazy.LazyDslKt$items$1.INSTANCE;
        }
        lazyListScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$2(function1, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$3(function12, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new androidx.compose.foundation.lazy.LazyDslKt$items$4(function4, list)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.LazyItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyListScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$2(function1, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$3(function12, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new androidx.compose.foundation.lazy.LazyDslKt$items$4(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List list, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1
                public final java.lang.Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyListScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2(function2, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3(function22, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.LazyItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyListScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2(function2, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3(function22, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = androidx.compose.foundation.lazy.LazyDslKt$items$5.INSTANCE;
        }
        lazyListScope.items(objArr.length, function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$6(function1, objArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$7(function12, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1781742563, true, new androidx.compose.foundation.lazy.LazyDslKt$items$8(function4, objArr)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.LazyListScope lazyListScope, T[] tArr, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.LazyItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyListScope.items(tArr.length, function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$6(function1, tArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$7(function12, tArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1781742563, true, new androidx.compose.foundation.lazy.LazyDslKt$items$8(function4, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$5
                public final java.lang.Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyListScope.items(objArr.length, function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6(function2, objArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7(function22, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1763000017, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8(function5, objArr)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.LazyListScope lazyListScope, T[] tArr, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.LazyItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyListScope.items(tArr.length, function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6(function2, tArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7(function22, tArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1763000017, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8(function5, tArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        androidx.compose.ui.Alignment.Vertical vertical2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        final boolean z4;
        final boolean z5;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        final androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        androidx.compose.foundation.OverscrollEffect overscrollEffect3;
        androidx.compose.foundation.OverscrollEffect overscrollEffect4;
        androidx.compose.ui.Alignment.Vertical vertical3;
        boolean z6;
        int i7;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior5;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1884325601);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i11 = 32;
                i3 |= i11;
            }
            i11 = 16;
            i3 |= i11;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0 && startRestartGroup.changed(horizontal)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                    i10 = 8192;
                    i3 |= i10;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i9 = 524288;
                        i3 |= i9;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & 256) == 0 && startRestartGroup.changed(overscrollEffect)) {
                            i8 = 67108864;
                            i3 |= i8;
                        }
                        i8 = 33554432;
                        i3 |= i8;
                    }
                    if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            companion = modifier;
                            lazyListState2 = lazyListState;
                            paddingValues2 = paddingValues;
                            horizontal3 = horizontal;
                            z6 = z2;
                            overscrollEffect4 = overscrollEffect;
                            i7 = i3;
                            vertical3 = vertical2;
                            flingBehavior5 = flingBehavior2;
                        } else {
                            companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                lazyListState2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListState2 = lazyListState;
                            }
                            paddingValues2 = i13 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                horizontal3 = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                i3 &= -57345;
                            } else {
                                horizontal3 = horizontal;
                            }
                            androidx.compose.ui.Alignment.Vertical top = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTop() : vertical2;
                            if ((i2 & 64) != 0) {
                                flingBehavior4 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior4 = flingBehavior2;
                            }
                            boolean z7 = i6 == 0 ? z2 : true;
                            if ((i2 & 256) != 0) {
                                overscrollEffect3 = androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                i3 &= -234881025;
                            } else {
                                overscrollEffect3 = overscrollEffect;
                            }
                            overscrollEffect4 = overscrollEffect3;
                            vertical3 = top;
                            z6 = z7;
                            i7 = i3;
                            flingBehavior5 = flingBehavior4;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1884325601, i7, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                        }
                        int i14 = i7 >> 3;
                        androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, paddingValues2, z3, false, flingBehavior5, z6, overscrollEffect4, 0, null, null, vertical3, horizontal3, function1, startRestartGroup, (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128), ((i7 >> 12) & 112) | ((i7 >> 6) & 896) | ((i7 >> 18) & 7168), 1792);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical3;
                        androidx.compose.foundation.OverscrollEffect overscrollEffect5 = overscrollEffect4;
                        flingBehavior3 = flingBehavior5;
                        z5 = z3;
                        overscrollEffect2 = overscrollEffect5;
                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4 = horizontal3;
                        z4 = z6;
                        horizontal2 = horizontal4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyListState2 = lazyListState;
                        paddingValues2 = paddingValues;
                        horizontal2 = horizontal;
                        z4 = z2;
                        z5 = z3;
                        flingBehavior3 = flingBehavior2;
                        overscrollEffect2 = overscrollEffect;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final androidx.compose.foundation.lazy.LazyListState lazyListState3 = lazyListState2;
                        final androidx.compose.foundation.layout.PaddingValues paddingValues3 = paddingValues2;
                        final androidx.compose.ui.Alignment.Vertical vertical4 = vertical2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                ((java.lang.Integer) obj2).intValue();
                                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.LazyDslKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier.this, lazyListState3, paddingValues3, z5, horizontal2, vertical4, flingBehavior3, z4, overscrollEffect2, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                return highResolutionOutputSizeshNQ4ISI;
                            }
                        });
                        return;
                    }
                    return;
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        androidx.compose.ui.Alignment.Horizontal horizontal2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        final boolean z4;
        final boolean z5;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        final androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        androidx.compose.foundation.OverscrollEffect overscrollEffect3;
        androidx.compose.foundation.OverscrollEffect overscrollEffect4;
        androidx.compose.ui.Alignment.Horizontal horizontal3;
        boolean z6;
        int i7;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior5;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(53695811);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i11 = 32;
                i3 |= i11;
            }
            i11 = 16;
            i3 |= i11;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0 && startRestartGroup.changed(vertical)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                    i10 = 8192;
                    i3 |= i10;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i9 = 524288;
                        i3 |= i9;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & 256) == 0 && startRestartGroup.changed(overscrollEffect)) {
                            i8 = 67108864;
                            i3 |= i8;
                        }
                        i8 = 33554432;
                        i3 |= i8;
                    }
                    if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            companion = modifier;
                            lazyListState2 = lazyListState;
                            paddingValues2 = paddingValues;
                            vertical3 = vertical;
                            z6 = z2;
                            overscrollEffect4 = overscrollEffect;
                            i7 = i3;
                            horizontal3 = horizontal2;
                            flingBehavior5 = flingBehavior2;
                        } else {
                            companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                lazyListState2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListState2 = lazyListState;
                            }
                            paddingValues2 = i13 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                vertical3 = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                i3 &= -57345;
                            } else {
                                vertical3 = vertical;
                            }
                            androidx.compose.ui.Alignment.Horizontal start = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getStart() : horizontal2;
                            if ((i2 & 64) != 0) {
                                flingBehavior4 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior4 = flingBehavior2;
                            }
                            boolean z7 = i6 == 0 ? z2 : true;
                            if ((i2 & 256) != 0) {
                                overscrollEffect3 = androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                i3 &= -234881025;
                            } else {
                                overscrollEffect3 = overscrollEffect;
                            }
                            overscrollEffect4 = overscrollEffect3;
                            horizontal3 = start;
                            z6 = z7;
                            i7 = i3;
                            flingBehavior5 = flingBehavior4;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(53695811, i7, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                        }
                        int i14 = i7 >> 3;
                        androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, paddingValues2, z3, true, flingBehavior5, z6, overscrollEffect4, 0, horizontal3, vertical3, null, null, function1, startRestartGroup, (i14 & 29360128) | (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (458752 & i14) | (3670016 & i14) | ((i7 << 12) & 1879048192), ((i7 >> 12) & 14) | ((i7 >> 18) & 7168), 6400);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal3;
                        androidx.compose.foundation.OverscrollEffect overscrollEffect5 = overscrollEffect4;
                        flingBehavior3 = flingBehavior5;
                        z5 = z3;
                        overscrollEffect2 = overscrollEffect5;
                        androidx.compose.foundation.layout.Arrangement.Vertical vertical4 = vertical3;
                        z4 = z6;
                        vertical2 = vertical4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyListState2 = lazyListState;
                        paddingValues2 = paddingValues;
                        vertical2 = vertical;
                        z4 = z2;
                        z5 = z3;
                        flingBehavior3 = flingBehavior2;
                        overscrollEffect2 = overscrollEffect;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final androidx.compose.foundation.lazy.LazyListState lazyListState3 = lazyListState2;
                        final androidx.compose.foundation.layout.PaddingValues paddingValues3 = paddingValues2;
                        final androidx.compose.ui.Alignment.Horizontal horizontal4 = horizontal2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRanges;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.LazyDslKt.getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.this, lazyListState3, paddingValues3, z5, vertical2, horizontal4, flingBehavior3, z4, overscrollEffect2, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoFpsRanges;
                            }
                        });
                        return;
                    }
                    return;
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i5;
        androidx.compose.ui.Alignment.Horizontal horizontal2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        boolean z3;
        final boolean z4;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.LazyListState lazyListState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical4;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior5;
        boolean z5;
        androidx.compose.foundation.lazy.LazyListState lazyListState4;
        int i7;
        androidx.compose.ui.Alignment.Horizontal horizontal3;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-740714857);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i10 = 32;
                i3 |= i10;
            }
            i10 = 16;
            i3 |= i10;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            companion = modifier;
                            lazyListState4 = lazyListState;
                            m1699PaddingValues0680j_4 = paddingValues;
                            z3 = z;
                            z5 = z2;
                            vertical4 = vertical2;
                            flingBehavior5 = flingBehavior2;
                            i7 = i3;
                            horizontal3 = horizontal2;
                        } else {
                            companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                lazyListState3 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListState3 = lazyListState;
                            }
                            m1699PaddingValues0680j_4 = i12 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                            z3 = i4 != 0 ? false : z;
                            if ((i2 & 16) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                vertical4 = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                i3 &= -57345;
                            } else {
                                vertical4 = vertical2;
                            }
                            androidx.compose.ui.Alignment.Horizontal start = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getStart() : horizontal2;
                            if ((i2 & 64) != 0) {
                                flingBehavior4 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior4 = flingBehavior2;
                            }
                            flingBehavior5 = flingBehavior4;
                            z5 = i6 == 0 ? z2 : true;
                            lazyListState4 = lazyListState3;
                            androidx.compose.ui.Alignment.Horizontal horizontal4 = start;
                            i7 = i3;
                            horizontal3 = horizontal4;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-740714857, i7, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:428)");
                        }
                        LazyColumn(companion, lazyListState4, m1699PaddingValues0680j_4, z3, vertical4, horizontal3, flingBehavior5, z5, androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0), function1, startRestartGroup, (33554430 & i7) | ((i7 << 3) & 1879048192), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal3;
                        flingBehavior3 = flingBehavior5;
                        vertical3 = vertical4;
                        z4 = z5;
                        paddingValues2 = m1699PaddingValues0680j_4;
                        lazyListState2 = lazyListState4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyListState2 = lazyListState;
                        paddingValues2 = paddingValues;
                        z3 = z;
                        z4 = z2;
                        vertical3 = vertical2;
                        flingBehavior3 = flingBehavior2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final androidx.compose.foundation.lazy.LazyListState lazyListState5 = lazyListState2;
                        final androidx.compose.foundation.layout.PaddingValues paddingValues3 = paddingValues2;
                        final boolean z6 = z3;
                        final androidx.compose.ui.Alignment.Horizontal horizontal5 = horizontal2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRanges;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.LazyDslKt.getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.this, lazyListState5, paddingValues3, z6, vertical3, horizontal5, flingBehavior3, z4, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoFpsRanges;
                            }
                        });
                        return;
                    }
                    return;
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i4;
        boolean z2;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i5;
        androidx.compose.ui.Alignment.Horizontal horizontal2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final boolean z3;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        androidx.compose.ui.Alignment.Horizontal horizontal3;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        boolean z4;
        androidx.compose.foundation.lazy.LazyListState lazyListState3;
        boolean z5;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-563353797);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i8 = 32;
                i3 |= i8;
            }
            i8 = 16;
            i3 |= i8;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i6 = 1048576;
                                i3 |= i6;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i6 = 524288;
                        i3 |= i6;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            companion = modifier;
                            lazyListState3 = lazyListState;
                            paddingValues3 = paddingValues2;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                z4 = false;
                                lazyListState3 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                z4 = false;
                                lazyListState3 = lazyListState;
                            }
                            paddingValues3 = i10 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                            if (i4 != 0) {
                                z2 = z4;
                            }
                            if ((i2 & 16) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                i3 &= -57345;
                                vertical2 = !z2 ? arrangement.getTop() : arrangement.getBottom();
                            }
                            if (i5 != 0) {
                                horizontal2 = androidx.compose.ui.Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                z5 = z2;
                                horizontal3 = horizontal2;
                                int i11 = i3;
                                androidx.compose.foundation.layout.Arrangement.Vertical vertical4 = vertical2;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-563353797, i11, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:455)");
                                }
                                LazyColumn(companion, lazyListState3, paddingValues3, z5, vertical4, horizontal3, flingBehavior3, true, null, function1, startRestartGroup, (i11 & 14) | 12582912 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | ((i11 << 6) & 1879048192), 256);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                vertical3 = vertical4;
                                z3 = z5;
                                lazyListState2 = lazyListState3;
                                modifier2 = companion;
                            }
                        }
                        z5 = z2;
                        horizontal3 = horizontal2;
                        flingBehavior3 = flingBehavior2;
                        int i112 = i3;
                        androidx.compose.foundation.layout.Arrangement.Vertical vertical42 = vertical2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        LazyColumn(companion, lazyListState3, paddingValues3, z5, vertical42, horizontal3, flingBehavior3, true, null, function1, startRestartGroup, (i112 & 14) | 12582912 | (i112 & 112) | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (3670016 & i112) | ((i112 << 6) & 1879048192), 256);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        vertical3 = vertical42;
                        z3 = z5;
                        lazyListState2 = lazyListState3;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        lazyListState2 = lazyListState;
                        paddingValues3 = paddingValues2;
                        z3 = z2;
                        vertical3 = vertical2;
                        horizontal3 = horizontal2;
                        flingBehavior3 = flingBehavior2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        final androidx.compose.foundation.lazy.LazyListState lazyListState4 = lazyListState2;
                        final androidx.compose.foundation.layout.PaddingValues paddingValues4 = paddingValues3;
                        final androidx.compose.ui.Alignment.Horizontal horizontal4 = horizontal3;
                        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior4 = flingBehavior3;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                ((java.lang.Integer) obj2).intValue();
                                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.LazyDslKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier.this, lazyListState4, paddingValues4, z3, vertical3, horizontal4, flingBehavior4, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                return highResolutionOutputSizeshNQ4ISI;
                            }
                        });
                        return;
                    }
                    return;
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i5;
        androidx.compose.ui.Alignment.Vertical vertical2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        boolean z3;
        final boolean z4;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.LazyListState lazyListState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior5;
        boolean z5;
        androidx.compose.foundation.lazy.LazyListState lazyListState4;
        int i7;
        androidx.compose.ui.Alignment.Vertical vertical3;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1724297413);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i10 = 32;
                i3 |= i10;
            }
            i10 = 16;
            i3 |= i10;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            companion = modifier;
                            lazyListState4 = lazyListState;
                            m1699PaddingValues0680j_4 = paddingValues;
                            z3 = z;
                            z5 = z2;
                            horizontal4 = horizontal2;
                            flingBehavior5 = flingBehavior2;
                            i7 = i3;
                            vertical3 = vertical2;
                        } else {
                            companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                lazyListState3 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListState3 = lazyListState;
                            }
                            m1699PaddingValues0680j_4 = i12 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                            z3 = i4 != 0 ? false : z;
                            if ((i2 & 16) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                horizontal4 = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                i3 &= -57345;
                            } else {
                                horizontal4 = horizontal2;
                            }
                            androidx.compose.ui.Alignment.Vertical top = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTop() : vertical2;
                            if ((i2 & 64) != 0) {
                                flingBehavior4 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior4 = flingBehavior2;
                            }
                            flingBehavior5 = flingBehavior4;
                            z5 = i6 == 0 ? z2 : true;
                            lazyListState4 = lazyListState3;
                            androidx.compose.ui.Alignment.Vertical vertical4 = top;
                            i7 = i3;
                            vertical3 = vertical4;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1724297413, i7, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:482)");
                        }
                        LazyRow(companion, lazyListState4, m1699PaddingValues0680j_4, z3, horizontal4, vertical3, flingBehavior5, z5, androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0), function1, startRestartGroup, (33554430 & i7) | ((i7 << 3) & 1879048192), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical3;
                        flingBehavior3 = flingBehavior5;
                        horizontal3 = horizontal4;
                        z4 = z5;
                        paddingValues2 = m1699PaddingValues0680j_4;
                        lazyListState2 = lazyListState4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyListState2 = lazyListState;
                        paddingValues2 = paddingValues;
                        z3 = z;
                        z4 = z2;
                        horizontal3 = horizontal2;
                        flingBehavior3 = flingBehavior2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final androidx.compose.foundation.lazy.LazyListState lazyListState5 = lazyListState2;
                        final androidx.compose.foundation.layout.PaddingValues paddingValues3 = paddingValues2;
                        final boolean z6 = z3;
                        final androidx.compose.ui.Alignment.Vertical vertical5 = vertical2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit Camera2StreamConfigurationMap;
                                ((java.lang.Integer) obj2).intValue();
                                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.LazyDslKt.Camera2StreamConfigurationMap(androidx.compose.ui.Modifier.this, lazyListState5, paddingValues3, z6, horizontal3, vertical5, flingBehavior3, z4, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                return Camera2StreamConfigurationMap;
                            }
                        });
                        return;
                    }
                    return;
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i4;
        boolean z2;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i5;
        androidx.compose.ui.Alignment.Vertical vertical2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final boolean z3;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        androidx.compose.ui.Alignment.Vertical vertical3;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        boolean z4;
        androidx.compose.foundation.lazy.LazyListState lazyListState3;
        boolean z5;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(407929823);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i8 = 32;
                i3 |= i8;
            }
            i8 = 16;
            i3 |= i8;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i6 = 1048576;
                                i3 |= i6;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i6 = 524288;
                        i3 |= i6;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            companion = modifier;
                            lazyListState3 = lazyListState;
                            paddingValues3 = paddingValues2;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                z4 = false;
                                lazyListState3 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                z4 = false;
                                lazyListState3 = lazyListState;
                            }
                            paddingValues3 = i10 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                            if (i4 != 0) {
                                z2 = z4;
                            }
                            if ((i2 & 16) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                i3 &= -57345;
                                horizontal2 = !z2 ? arrangement.getStart() : arrangement.getEnd();
                            }
                            if (i5 != 0) {
                                vertical2 = androidx.compose.ui.Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                z5 = z2;
                                vertical3 = vertical2;
                                int i11 = i3;
                                androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4 = horizontal2;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(407929823, i11, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:509)");
                                }
                                LazyRow(companion, lazyListState3, paddingValues3, z5, horizontal4, vertical3, flingBehavior3, true, null, function1, startRestartGroup, (i11 & 14) | 12582912 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | ((i11 << 6) & 1879048192), 256);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                horizontal3 = horizontal4;
                                z3 = z5;
                                lazyListState2 = lazyListState3;
                                modifier2 = companion;
                            }
                        }
                        z5 = z2;
                        vertical3 = vertical2;
                        flingBehavior3 = flingBehavior2;
                        int i112 = i3;
                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal42 = horizontal2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        LazyRow(companion, lazyListState3, paddingValues3, z5, horizontal42, vertical3, flingBehavior3, true, null, function1, startRestartGroup, (i112 & 14) | 12582912 | (i112 & 112) | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (3670016 & i112) | ((i112 << 6) & 1879048192), 256);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        horizontal3 = horizontal42;
                        z3 = z5;
                        lazyListState2 = lazyListState3;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        lazyListState2 = lazyListState;
                        paddingValues3 = paddingValues2;
                        z3 = z2;
                        horizontal3 = horizontal2;
                        vertical3 = vertical2;
                        flingBehavior3 = flingBehavior2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        final androidx.compose.foundation.lazy.LazyListState lazyListState4 = lazyListState2;
                        final androidx.compose.foundation.layout.PaddingValues paddingValues4 = paddingValues3;
                        final androidx.compose.ui.Alignment.Vertical vertical4 = vertical3;
                        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior4 = flingBehavior3;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                ((java.lang.Integer) obj2).intValue();
                                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.LazyDslKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier.this, lazyListState4, paddingValues4, z3, horizontal3, vertical4, flingBehavior4, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                return highResolutionOutputSizeshNQ4ISI;
                            }
                        });
                        return;
                    }
                    return;
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$2(function1, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$3(androidx.compose.foundation.lazy.LazyDslKt$items$1.INSTANCE, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new androidx.compose.foundation.lazy.LazyDslKt$items$4(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List list, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2(function2, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(objArr.length, function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$6(function1, objArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$7(androidx.compose.foundation.lazy.LazyDslKt$items$5.INSTANCE, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1781742563, true, new androidx.compose.foundation.lazy.LazyDslKt$items$8(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(objArr.length, function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6(function2, objArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1763000017, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8(function5, objArr)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z2, overscrollEffect, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z2, overscrollEffect, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
