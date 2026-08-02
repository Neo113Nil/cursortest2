package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.ObservableComposition;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B'\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ \u0010g\u001a\u00020\\2\u0011\u0010h\u001a\r\u0012\u0004\u0012\u00020\\0[¢\u0006\u0002\b]H\u0016¢\u0006\u0002\u0010aJ \u0010i\u001a\u00020\\2\u0011\u0010h\u001a\r\u0012\u0004\u0012\u00020\\0[¢\u0006\u0002\b]H\u0016¢\u0006\u0002\u0010aJ \u0010j\u001a\u00020k2\u0011\u0010h\u001a\r\u0012\u0004\u0012\u00020\\0[¢\u0006\u0002\b]H\u0016¢\u0006\u0002\u0010lJ \u0010m\u001a\u00020k2\u0011\u0010h\u001a\r\u0012\u0004\u0012\u00020\\0[¢\u0006\u0002\b]H\u0016¢\u0006\u0002\u0010lJ\u001d\u0010n\u001a\u00020\\2\u000e\u0010o\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010pH\u0000¢\u0006\u0002\brJ \u0010s\u001a\u00020\\2\u0011\u0010h\u001a\r\u0012\u0004\u0012\u00020\\0[¢\u0006\u0002\b]H\u0002¢\u0006\u0002\u0010aJ(\u0010t\u001a\u00020k2\u0006\u0010u\u001a\u00020<2\u0011\u0010h\u001a\r\u0012\u0004\u0012\u00020\\0[¢\u0006\u0002\b]H\u0002¢\u0006\u0002\u0010vJ \u0010w\u001a\u00020\\2\u0011\u0010h\u001a\r\u0012\u0004\u0012\u00020\\0[¢\u0006\u0002\b]H\u0002¢\u0006\u0002\u0010aJ\b\u0010x\u001a\u00020\\H\u0002J\b\u0010y\u001a\u00020<H\u0002J\u0010\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}H\u0016J\u000e\u0010~\u001a\u00020\\2\u0006\u0010\u007f\u001a\u00020HJ\t\u0010\u0080\u0001\u001a\u00020\\H\u0002J\t\u0010\u0081\u0001\u001a\u00020\\H\u0002J\t\u0010\u0082\u0001\u001a\u00020\\H\u0002J!\u0010\u0083\u0001\u001a\u00020\\2\u0011\u0010h\u001a\r\u0012\u0004\u0012\u00020\\0[¢\u0006\u0002\b]H\u0016¢\u0006\u0002\u0010aJ\u000f\u0010\u0084\u0001\u001a\u00020\\H\u0000¢\u0006\u0003\b\u0085\u0001J\t\u0010\u0086\u0001\u001a\u00020\\H\u0016J\u0018\u0010\u0089\u0001\u001a\u00020\\2\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130(H\u0016J\u0018\u0010\u008b\u0001\u001a\u00020<2\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130(H\u0016J\u0018\u0010\u008c\u0001\u001a\u00020\\2\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0016J,\u0010\u008e\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00130\u008f\u0001032\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0000¢\u0006\u0003\b\u0092\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\\2\u0007\u0010\u0094\u0001\u001a\u00020\u00132\u0007\u0010\u0095\u0001\u001a\u00020<H\u0002J!\u0010\u0093\u0001\u001a\u00020\\2\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130(2\u0007\u0010\u0095\u0001\u001a\u00020<H\u0002J\t\u0010\u0096\u0001\u001a\u00020\\H\u0002J\u0012\u0010\u0097\u0001\u001a\u00020\\2\u0007\u0010\u0094\u0001\u001a\u00020\u0013H\u0016J\u0012\u0010\u0098\u0001\u001a\u00020\\2\u0007\u0010\u0094\u0001\u001a\u00020\u0013H\u0002J\u0012\u0010\u0099\u0001\u001a\u00020\\2\u0007\u0010\u0094\u0001\u001a\u00020\u0013H\u0016J\t\u0010\u009a\u0001\u001a\u00020<H\u0016J)\u0010\u009b\u0001\u001a\u00020\\2\u001e\u0010\u009c\u0001\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u009d\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u009d\u00010\u008f\u000103H\u0016J\u0012\u0010\u009e\u0001\u001a\u00020\\2\u0007\u0010W\u001a\u00030\u009f\u0001H\u0016J\u0011\u0010 \u0001\u001a\u00020\\2\u0006\u00106\u001a\u000207H\u0002J\t\u0010¡\u0001\u001a\u00020\\H\u0016J\t\u0010¢\u0001\u001a\u00020\\H\u0016J\t\u0010£\u0001\u001a\u00020\\H\u0016JL\u0010¤\u0001\u001a\u0003H¥\u0001\"\u0005\b\u0000\u0010¥\u000122\u0010\u008d\u0001\u001a-\u0012!\u0012\u001f\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00130$¢\u0006\u000e\b§\u0001\u0012\t\b¨\u0001\u0012\u0004\b\b(6\u0012\u0005\u0012\u0003H¥\u00010¦\u0001H\u0082\b¢\u0006\u0003\u0010©\u0001J(\u0010ª\u0001\u001a\u0003H¥\u0001\"\u0005\b\u0000\u0010¥\u00012\u000e\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u0003H¥\u00010[H\u0082\b¢\u0006\u0003\u0010«\u0001J\t\u0010¬\u0001\u001a\u00020\\H\u0016J\t\u0010\u00ad\u0001\u001a\u00020\\H\u0016J\t\u0010®\u0001\u001a\u00020\\H\u0016J;\u0010¯\u0001\u001a\u0003H°\u0001\"\u0005\b\u0000\u0010°\u00012\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010²\u0001\u001a\u00020H2\u000e\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u0003H°\u00010[H\u0016¢\u0006\u0003\u0010³\u0001J\u0015\u0010´\u0001\u001a\u0004\u0018\u00010C2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u001e\u0010µ\u0001\u001a\u00030¶\u00012\u0007\u0010·\u0001\u001a\u00020%2\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010¹\u0001\u001a\u00020\\2\u0007\u0010·\u0001\u001a\u00020%H\u0016J)\u0010º\u0001\u001a\u0005\u0018\u0001H¥\u0001\"\u0005\b\u0000\u0010¥\u00012\u000e\u0010\u007f\u001a\n\u0012\u0005\u0012\u0003H¥\u00010»\u0001H\u0016¢\u0006\u0003\u0010¼\u0001J\u001d\u0010½\u0001\u001a\u00020<2\u0007\u0010·\u0001\u001a\u00020%2\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u0013H\u0002J(\u0010¾\u0001\u001a\u00030¶\u00012\u0007\u0010·\u0001\u001a\u00020%2\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u0013H\u0002J!\u0010¿\u0001\u001a\u00020\\2\u0007\u0010¸\u0001\u001a\u00020\u00132\u0007\u0010·\u0001\u001a\u00020%H\u0000¢\u0006\u0003\bÀ\u0001J\u001b\u0010Á\u0001\u001a\u00020\\2\n\u0010W\u001a\u0006\u0012\u0002\b\u00030/H\u0000¢\u0006\u0003\bÂ\u0001J\u001e\u0010Ã\u0001\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00130$H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0011\u0010Æ\u0001\u001a\u00020\\2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J(\u0010Ç\u0001\u001a\u0003H¥\u0001\"\u0005\b\u0000\u0010¥\u00012\u000e\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u0003H¥\u00010[H\u0082\b¢\u0006\u0003\u0010«\u0001J\n\u0010|\u001a\u0004\u0018\u00010}H\u0002J\t\u0010È\u0001\u001a\u00020\\H\u0016J\u000f\u0010É\u0001\u001a\u00020HH\u0000¢\u0006\u0003\bÊ\u0001R\u0013\u0010\u0007\u001a\u00020\b8G¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013`\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0016\u001a\u00060\u0013j\u0002`\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130(8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020%0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020%0,X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010&R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130(8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010*R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020%038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010&R\u001c\u0010:\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00130$X\u0082\u000e¢\u0006\u0004\n\u0002\u0010&R \u0010;\u001a\u00020<X\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b=\u0010\u001d\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\u00020JX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020NX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u00020PX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0010\u0010S\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010V\u001a\u00020<¢\u0006\b\n\u0000\u001a\u0004\bV\u0010?R\u000e\u0010W\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010?R'\u0010Z\u001a\r\u0012\u0004\u0012\u00020\\0[¢\u0006\u0002\b]X\u0086\u000e¢\u0006\u0010\n\u0002\u0010b\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010?R\u0014\u0010d\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010?R\u0014\u0010e\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010?R\u0016\u0010\u0087\u0001\u001a\u00020<8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010?¨\u0006Ë\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/runtime/PausableComposition;", "Landroidx/compose/runtime/tooling/ObservableComposition;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "getParent", "()Landroidx/compose/runtime/CompositionContext;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "lock", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "getAbandonSet$annotations", "()V", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime$annotations", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "observations", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/collection/MutableScatterMap;", "observedObjects", "", "getObservedObjects$runtime", "()Ljava/util/Set;", "invalidatedScopes", "Landroidx/collection/MutableScatterSet;", "conditionallyInvalidatedScopes", "derivedStates", "Landroidx/compose/runtime/DerivedState;", "derivedStateDependencies", "getDerivedStateDependencies$runtime", "conditionalScopes", "", "getConditionalScopes$runtime", "()Ljava/util/List;", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "observationsProcessed", "invalidations", "pendingInvalidScopes", "", "getPendingInvalidScopes$runtime$annotations", "getPendingInvalidScopes$runtime", "()Z", "setPendingInvalidScopes$runtime", "(Z)V", "shouldPause", "Landroidx/compose/runtime/ShouldPauseCallback;", "pendingPausedComposition", "Landroidx/compose/runtime/PausedCompositionImpl;", "invalidationDelegate", "invalidationDelegateGroup", "", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "rememberManager", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "getComposer$runtime", "()Landroidx/compose/runtime/ComposerImpl;", "_recomposeContext", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "isRoot", "state", "areChildrenComposing", "getAreChildrenComposing", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "isComposing", "isDisposed", "hasPendingChanges", "getHasPendingChanges", "setContent", FirebaseAnalytics.Param.CONTENT, "setContentWithReuse", "setPausableContent", "Landroidx/compose/runtime/PausedComposition;", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "setPausableContentWithReuse", "pausedCompositionFinished", "ignoreSet", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RememberObserverHolder;", "pausedCompositionFinished$runtime", "composeInitial", "composeInitialPaused", "reusable", "(ZLkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "composeInitialWithReuse", "ensureRunning", "clearDeactivated", "setObserver", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "invalidateGroupsWithKey", Constants.KEY, "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "drainPendingModificationsOutOfBandLocked", "composeContent", "updateMovingInvalidations", "updateMovingInvalidations$runtime", "dispose", "hasInvalidations", "getHasInvalidations", "recordModificationsOf", "values", "observesAnyOf", "prepareCompose", "block", "extractInvalidationsOf", "Lkotlin/Pair;", "anchor", "Landroidx/compose/runtime/Anchor;", "extractInvalidationsOf$runtime", "addPendingInvalidationsLocked", "value", "forgetConditionalScopes", "cleanUpDerivedStateObservations", "recordReadOf", "invalidateScopeOfLocked", "recordWriteOf", "recompose", "insertMovableContent", "references", "Landroidx/compose/runtime/MovableContentStateReference;", "disposeUnusedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "applyChangesInLocked", "applyChanges", "applyLateChanges", "changesApplied", "guardInvalidationsLocked", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "guardChanges", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "abandonChanges", "invalidateAll", "verifyConsistent", "delegateInvalidations", "R", "to", "groupIndex", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAndSetShouldPauseCallback", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "recomposeScopeReleased", "getCompositionService", "Landroidx/compose/runtime/CompositionServiceKey;", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "tryImminentInvalidation", "invalidateChecked", "removeObservation", "removeObservation$runtime", "removeDerivedStateObservation", "removeDerivedStateObservation$runtime", "takeInvalidations", "takeInvalidations-afanTW4", "()Landroidx/collection/MutableScatterMap;", "validateRecomposeScopeAnchors", "trackAbandonedValues", "deactivate", "composerStacksSizes", "composerStacksSizes$runtime", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n+ 7 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 8 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 9 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 13 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 14 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 15 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 16 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 17 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 18 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 19 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 20 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1447:1\n1194#1,2:1477\n1378#1,3:1479\n1184#1,6:1483\n1382#1,2:1490\n1385#1:1499\n1196#1,4:1500\n1184#1,6:1505\n1194#1,2:2075\n1378#1,3:2077\n1184#1,6:2080\n1382#1,2:2087\n1385#1:2096\n1196#1,4:2097\n1194#1,2:2113\n1378#1,3:2115\n1382#1,2:2119\n1385#1:2128\n1196#1,4:2129\n1194#1,2:2230\n1378#1,3:2232\n1382#1,2:2236\n1385#1:2245\n1196#1,4:2246\n1194#1,2:2251\n1378#1,3:2253\n1382#1,2:2257\n1385#1:2266\n1196#1,4:2267\n1194#1,2:2272\n1378#1,3:2274\n1382#1,2:2285\n1385#1:2294\n1196#1,4:2295\n1378#1,3:2299\n1382#1,2:2303\n1385#1:2312\n25#2,5:1448\n33#2:1454\n33#2:1467\n33#2:1468\n33#2:1469\n33#2:1482\n33#2:1504\n33#2:1511\n33#2:1530\n33#2:1531\n33#2:2038\n33#2:2074\n33#2:2229\n33#2:2250\n33#2:2271\n33#2:2320\n33#2:2323\n33#2:2324\n33#2:2325\n33#2:2394\n1#3:1453\n1#3:1489\n1#3:1523\n1#3:2086\n1#3:2118\n1#3:2140\n1#3:2154\n1#3:2235\n1#3:2256\n1#3:2284\n1#3:2302\n1#3:2376\n1#3:2409\n49#4,4:1455\n49#4,4:1459\n49#4,4:1463\n49#4,4:1512\n49#4,4:2382\n49#4,4:2395\n91#5:1470\n34#5,5:1471\n92#5:1476\n106#5:2101\n34#5,5:2102\n107#5:2107\n34#5,3:2379\n38#5:2386\n87#6,7:1492\n87#6,3:1516\n91#6,3:1527\n87#6,7:2089\n87#6,7:2121\n87#6,3:2133\n91#6,3:2144\n87#6,7:2238\n87#6,7:2259\n87#6,7:2277\n87#6,7:2287\n87#6,7:2305\n87#6,7:2313\n87#6,7:2387\n87#6,3:2402\n91#6,3:2413\n175#7,4:1519\n180#7,3:1524\n175#7,4:2136\n180#7,3:2141\n175#7,4:2150\n180#7,3:2155\n175#7,4:2405\n180#7,3:2410\n41#8,3:1532\n46#8:1560\n48#8:1563\n41#8,3:1666\n46#8:1728\n48#8:1756\n231#9,3:1535\n200#9,7:1538\n211#9,3:1546\n214#9,9:1550\n234#9:1559\n200#9,16:1587\n217#9,6:1607\n231#9,3:1637\n200#9,7:1640\n211#9,3:1648\n214#9,9:1652\n234#9:1661\n231#9,3:1669\n200#9,7:1672\n211#9,3:1680\n214#9,2:1684\n231#9,3:1692\n200#9,7:1695\n211#9,3:1703\n214#9,9:1707\n234#9:1716\n217#9,6:1721\n234#9:1727\n231#9,3:1730\n200#9,7:1733\n211#9,3:1741\n214#9,9:1745\n234#9:1754\n200#9,7:1779\n211#9,3:1787\n214#9,2:1791\n217#9,6:1797\n200#9,7:1843\n211#9,3:1851\n214#9,2:1855\n217#9,6:1861\n200#9,16:1907\n217#9,6:1927\n200#9,7:1953\n211#9,3:1961\n214#9,2:1965\n217#9,6:1971\n231#9,3:2009\n200#9,7:2012\n211#9,3:2020\n214#9,9:2024\n234#9:2033\n231#9,3:2045\n200#9,7:2048\n211#9,3:2056\n214#9,9:2060\n234#9:2069\n200#9,16:2184\n217#9,6:2204\n231#9,3:2333\n200#9,7:2336\n211#9,3:2344\n214#9,9:2348\n234#9:2357\n1399#10:1545\n1270#10:1549\n1399#10:1572\n1270#10:1576\n1399#10:1647\n1270#10:1651\n1399#10:1679\n1270#10:1683\n1399#10:1702\n1270#10:1706\n1399#10:1740\n1270#10:1744\n1399#10:1765\n1270#10:1769\n1399#10:1786\n1270#10:1790\n1399#10:1829\n1270#10:1833\n1399#10:1850\n1270#10:1854\n1399#10:1893\n1270#10:1897\n1399#10:1960\n1270#10:1964\n1399#10:1988\n1270#10:1992\n1399#10:2019\n1270#10:2023\n1399#10:2055\n1270#10:2059\n1399#10:2170\n1270#10:2174\n1399#10:2343\n1270#10:2347\n1863#11,2:1561\n1863#11:1729\n1864#11:1755\n139#12:1564\n140#12,5:1580\n145#12,6:1614\n152#12:1630\n67#12,6:1631\n75#12,4:1662\n67#12,6:1686\n75#12,4:1717\n123#12:1757\n124#12,4:1773\n128#12,6:1804\n135#12:1820\n123#12:1821\n124#12,4:1837\n128#12,6:1868\n135#12:1884\n123#12:1885\n124#12,4:1901\n128#12,6:1934\n135#12:1950\n67#12,6:2003\n75#12,4:2034\n67#12,6:2039\n75#12,4:2070\n123#12:2162\n124#12,4:2178\n128#12,6:2211\n135#12:2227\n81#12:2326\n67#12,6:2327\n75#12,8:2358\n842#13:1565\n844#13:1579\n845#13,3:1620\n848#13:1629\n842#13:1758\n844#13:1772\n845#13,3:1810\n848#13:1819\n842#13:1822\n844#13:1836\n845#13,3:1874\n848#13:1883\n842#13:1886\n844#13:1900\n845#13,3:1940\n848#13:1949\n842#13:2163\n844#13:2177\n845#13,3:2217\n848#13:2226\n329#14,6:1566\n339#14,3:1573\n342#14,2:1577\n345#14,6:1623\n329#14,6:1759\n339#14,3:1766\n342#14,2:1770\n345#14,6:1813\n329#14,6:1823\n339#14,3:1830\n342#14,2:1834\n345#14,6:1877\n329#14,6:1887\n339#14,3:1894\n342#14,2:1898\n345#14,6:1943\n329#14,6:2164\n339#14,3:2171\n342#14,2:2175\n345#14,6:2220\n809#15,2:1585\n812#15,4:1603\n816#15:1613\n809#15,2:1777\n812#15,4:1793\n816#15:1803\n809#15,2:1841\n812#15,4:1857\n816#15:1867\n809#15,2:1905\n812#15,4:1923\n816#15:1933\n809#15,2:1951\n812#15,4:1967\n816#15:1977\n809#15,2:2182\n812#15,4:2200\n816#15:2210\n54#16:1978\n54#16:1995\n403#17,3:1979\n367#17,6:1982\n377#17,3:1989\n380#17,2:1993\n383#17,6:1996\n406#17:2002\n4809#18:2108\n4788#18,4:2109\n45#19,3:2147\n49#19:2158\n45#19,3:2159\n49#19:2228\n45#19,3:2399\n49#19:2416\n13409#20,2:2321\n11483#20,9:2366\n13409#20:2375\n13410#20:2377\n11492#20:2378\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n828#1:1477,2\n828#1:1479,3\n831#1:1483,6\n828#1:1490,2\n828#1:1499\n828#1:1500,4\n841#1:1505,6\n1073#1:2075,2\n1073#1:2077,3\n1074#1:2080,6\n1073#1:2087,2\n1073#1:2096\n1073#1:2097,4\n1087#1:2113,2\n1087#1:2115,3\n1087#1:2119,2\n1087#1:2128\n1087#1:2129,4\n1148#1:2230,2\n1148#1:2232,3\n1148#1:2236,2\n1148#1:2245\n1148#1:2246,4\n1157#1:2251,2\n1157#1:2253,3\n1157#1:2257,2\n1157#1:2266\n1157#1:2267,4\n1167#1:2272,2\n1167#1:2274,3\n1167#1:2285,2\n1167#1:2294\n1167#1:2295,4\n1195#1:2299,3\n1195#1:2303,2\n1195#1:2312\n469#1:1448,5\n630#1:1454\n720#1:1467\n730#1:1468\n747#1:1469\n829#1:1482\n839#1:1504\n848#1:1511\n894#1:1530\n917#1:1531\n1052#1:2038\n1061#1:2074\n1147#1:2229\n1156#1:2250\n1166#1:2271\n1212#1:2320\n1216#1:2323\n1259#1:2324\n1293#1:2325\n1391#1:2394\n828#1:1489\n879#1:1523\n1073#1:2086\n1087#1:2118\n1093#1:2140\n1108#1:2154\n1148#1:2235\n1157#1:2256\n1167#1:2284\n1195#1:2302\n1365#1:2376\n1401#1:2409\n679#1:1455,4\n704#1:1459,4\n714#1:1463,4\n849#1:1512,4\n1368#1:2382,4\n1392#1:2395,4\n754#1:1470\n754#1:1471,5\n754#1:1476\n1086#1:2101\n1086#1:2102,5\n1086#1:2107\n1366#1:2379,3\n1366#1:2386\n828#1:1492,7\n876#1:1516,3\n876#1:1527,3\n1073#1:2089,7\n1087#1:2121,7\n1091#1:2133,3\n1091#1:2144,3\n1148#1:2238,7\n1157#1:2259,7\n1173#1:2277,7\n1167#1:2287,7\n1195#1:2305,7\n1207#1:2313,7\n1383#1:2387,7\n1398#1:2402,3\n1398#1:2413,3\n879#1:1519,4\n879#1:1524,3\n1093#1:2136,4\n1093#1:2141,3\n1108#1:2150,4\n1108#1:2155,3\n1401#1:2405,4\n1401#1:2410,3\n925#1:1532,3\n925#1:1560\n925#1:1563\n974#1:1666,3\n974#1:1728\n974#1:1756\n925#1:1535,3\n925#1:1538,7\n925#1:1546,3\n925#1:1550,9\n925#1:1559\n942#1:1587,16\n942#1:1607,6\n959#1:1637,3\n959#1:1640,7\n959#1:1648,3\n959#1:1652,9\n959#1:1661\n974#1:1669,3\n974#1:1672,7\n974#1:1680,3\n974#1:1684,2\n979#1:1692,3\n979#1:1695,7\n979#1:1703,3\n979#1:1707,9\n979#1:1716\n974#1:1721,6\n974#1:1727\n979#1:1730,3\n979#1:1733,7\n979#1:1741,3\n979#1:1745,9\n979#1:1754\n988#1:1779,7\n988#1:1787,3\n988#1:1791,2\n988#1:1797,6\n994#1:1843,7\n994#1:1851,3\n994#1:1855,2\n994#1:1861,6\n1001#1:1907,16\n1001#1:1927,6\n1003#1:1953,7\n1003#1:1961,3\n1003#1:1965,2\n1003#1:1971,6\n1043#1:2009,3\n1043#1:2012,7\n1043#1:2020,3\n1043#1:2024,9\n1043#1:2033\n1057#1:2045,3\n1057#1:2048,7\n1057#1:2056,3\n1057#1:2060,9\n1057#1:2069\n1128#1:2184,16\n1128#1:2204,6\n1323#1:2333,3\n1323#1:2336,7\n1323#1:2344,3\n1323#1:2348,9\n1323#1:2357\n925#1:1545\n925#1:1549\n942#1:1572\n942#1:1576\n959#1:1647\n959#1:1651\n974#1:1679\n974#1:1683\n979#1:1702\n979#1:1706\n979#1:1740\n979#1:1744\n988#1:1765\n988#1:1769\n988#1:1786\n988#1:1790\n994#1:1829\n994#1:1833\n994#1:1850\n994#1:1854\n1001#1:1893\n1001#1:1897\n1003#1:1960\n1003#1:1964\n1028#1:1988\n1028#1:1992\n1043#1:2019\n1043#1:2023\n1057#1:2055\n1057#1:2059\n1128#1:2170\n1128#1:2174\n1323#1:2343\n1323#1:2347\n925#1:1561,2\n974#1:1729\n974#1:1755\n942#1:1564\n942#1:1580,5\n942#1:1614,6\n942#1:1630\n959#1:1631,6\n959#1:1662,4\n979#1:1686,6\n979#1:1717,4\n988#1:1757\n988#1:1773,4\n988#1:1804,6\n988#1:1820\n994#1:1821\n994#1:1837,4\n994#1:1868,6\n994#1:1884\n1001#1:1885\n1001#1:1901,4\n1001#1:1934,6\n1001#1:1950\n1043#1:2003,6\n1043#1:2034,4\n1057#1:2039,6\n1057#1:2070,4\n1128#1:2162\n1128#1:2178,4\n1128#1:2211,6\n1128#1:2227\n1323#1:2326\n1323#1:2327,6\n1323#1:2358,8\n942#1:1565\n942#1:1579\n942#1:1620,3\n942#1:1629\n988#1:1758\n988#1:1772\n988#1:1810,3\n988#1:1819\n994#1:1822\n994#1:1836\n994#1:1874,3\n994#1:1883\n1001#1:1886\n1001#1:1900\n1001#1:1940,3\n1001#1:1949\n1128#1:2163\n1128#1:2177\n1128#1:2217,3\n1128#1:2226\n942#1:1566,6\n942#1:1573,3\n942#1:1577,2\n942#1:1623,6\n988#1:1759,6\n988#1:1766,3\n988#1:1770,2\n988#1:1813,6\n994#1:1823,6\n994#1:1830,3\n994#1:1834,2\n994#1:1877,6\n1001#1:1887,6\n1001#1:1894,3\n1001#1:1898,2\n1001#1:1943,6\n1128#1:2164,6\n1128#1:2171,3\n1128#1:2175,2\n1128#1:2220,6\n942#1:1585,2\n942#1:1603,4\n942#1:1613\n988#1:1777,2\n988#1:1793,4\n988#1:1803\n994#1:1841,2\n994#1:1857,4\n994#1:1867\n1001#1:1905,2\n1001#1:1923,4\n1001#1:1933\n1003#1:1951,2\n1003#1:1967,4\n1003#1:1977\n1128#1:2182,2\n1128#1:2200,4\n1128#1:2210\n1019#1:1978\n1030#1:1995\n1028#1:1979,3\n1028#1:1982,6\n1028#1:1989,3\n1028#1:1993,2\n1028#1:1996,6\n1028#1:2002\n1086#1:2108\n1086#1:2109,4\n1102#1:2147,3\n1102#1:2158\n1126#1:2159,3\n1126#1:2228\n1397#1:2399,3\n1397#1:2416\n1212#1:2321,2\n1365#1:2366,9\n1365#1:2375\n1365#1:2377\n1365#1:2378\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition, ObservableComposition {
    public static final int $stable = 8;
    private final CoroutineContext _recomposeContext;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ChangeList changes;
    private Function2<? super Composer, ? super Integer, Unit> composable;
    private final ComposerImpl composer;
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final MutableScatterMap<Object, Object> derivedStates;
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private MutableScatterMap<Object, Object> invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final MutableScatterMap<Object, Object> observations;
    private final MutableScatterMap<Object, Object> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private PausedCompositionImpl pendingPausedComposition;
    private final RememberEventDispatcher rememberManager;
    private ShouldPauseCallback shouldPause;
    private final SlotTable slotTable;
    private int state;

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier, CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        int i = 0;
        int i2 = 1;
        Set<RememberObserver> asMutableSet = new MutableScatterSet(i, i2, defaultConstructorMarker).asMutableSet();
        this.abandonSet = asMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = ScopeMap.m208constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
        this.conditionallyInvalidatedScopes = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
        this.derivedStates = ScopeMap.m208constructorimpl$default(null, 1, null);
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = ScopeMap.m208constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m208constructorimpl$default(null, 1, null);
        CompositionObserverHolder compositionObserverHolder = new CompositionObserverHolder(null, false, compositionContext, 3, null);
        this.observerHolder = compositionObserverHolder;
        this.rememberManager = new RememberEventDispatcher();
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, asMutableSet, changeList, changeList2, compositionObserverHolder, this);
        compositionContext.registerComposer$runtime(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$954879418$runtime();
    }

    private final void addPendingInvalidationsLocked(Object value, boolean forgetConditionalScopes) {
        Object obj = this.observations.get(value);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
            if (ScopeMap.m215removeimpl(this.observationsProcessed, value, recomposeScopeImpl) || recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IGNORED) {
                return;
            }
            if (!recomposeScopeImpl.isConditional() || forgetConditionalScopes) {
                this.invalidatedScopes.add(recomposeScopeImpl);
                return;
            } else {
                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                return;
            }
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                        if (!ScopeMap.m215removeimpl(this.observationsProcessed, value, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(value) != InvalidationResult.IGNORED) {
                            if (!recomposeScopeImpl2.isConditional() || forgetConditionalScopes) {
                                this.invalidatedScopes.add(recomposeScopeImpl2);
                            } else {
                                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void applyChangesInLocked(ChangeList changes) {
        Applier<?> applier;
        RememberEventDispatcher rememberEventDispatcher;
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long[] jArr3;
        this.rememberManager.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
        try {
            if (changes.isEmpty()) {
                try {
                    if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                        this.rememberManager.dispatchAbandons();
                    }
                } finally {
                }
            } else {
                Trace trace = Trace.INSTANCE;
                Object beginSection = trace.beginSection("Compose:applyChanges");
                try {
                    PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
                    if (pausedCompositionImpl == null || (applier = pausedCompositionImpl.getPausableApplier$runtime()) == null) {
                        applier = this.applier;
                    }
                    PausedCompositionImpl pausedCompositionImpl2 = this.pendingPausedComposition;
                    if (pausedCompositionImpl2 == null || (rememberEventDispatcher = pausedCompositionImpl2.getRememberManager()) == null) {
                        rememberEventDispatcher = this.rememberManager;
                    }
                    applier.onBeginChanges();
                    SlotWriter openWriter = this.slotTable.openWriter();
                    int i2 = 0;
                    try {
                        changes.executeAndFlushAllPendingChanges(applier, openWriter, rememberEventDispatcher, this.composer.getErrorContext$runtime());
                        Unit unit = Unit.INSTANCE;
                        openWriter.close(true);
                        applier.onEndChanges();
                        trace.endSection(beginSection);
                        this.rememberManager.dispatchRememberObservers();
                        this.rememberManager.dispatchSideEffects();
                        if (this.pendingInvalidScopes) {
                            beginSection = trace.beginSection("Compose:unobserve");
                            try {
                                this.pendingInvalidScopes = false;
                                MutableScatterMap<Object, Object> mutableScatterMap = this.observations;
                                long[] jArr4 = mutableScatterMap.metadata;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j3 = jArr4[i3];
                                        char c2 = 7;
                                        long j4 = -9187201950435737472L;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8;
                                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                                            int i6 = i2;
                                            while (i6 < i5) {
                                                if ((j3 & 255) < 128) {
                                                    int i7 = (i3 << 3) + i6;
                                                    c = c2;
                                                    Object obj = mutableScatterMap.keys[i7];
                                                    Object obj2 = mutableScatterMap.values[i7];
                                                    j2 = j4;
                                                    if (obj2 instanceof MutableScatterSet) {
                                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                                        Object[] objArr = mutableScatterSet.elements;
                                                        long[] jArr5 = mutableScatterSet.metadata;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j = j3;
                                                            int i8 = i4;
                                                            int i9 = 0;
                                                            while (true) {
                                                                long j5 = jArr5[i9];
                                                                Object[] objArr2 = objArr;
                                                                long[] jArr6 = jArr5;
                                                                if ((((~j5) << c) & j5 & j2) != j2) {
                                                                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                                    int i11 = 0;
                                                                    while (i11 < i10) {
                                                                        if ((j5 & 255) < 128) {
                                                                            jArr3 = jArr4;
                                                                            int i12 = (i9 << 3) + i11;
                                                                            if (!((RecomposeScopeImpl) objArr2[i12]).getValid()) {
                                                                                mutableScatterSet.removeElementAt(i12);
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr4;
                                                                        }
                                                                        j5 >>= i8;
                                                                        i11++;
                                                                        jArr4 = jArr3;
                                                                    }
                                                                    jArr2 = jArr4;
                                                                    if (i10 != i8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr2 = jArr4;
                                                                }
                                                                if (i9 == length2) {
                                                                    break;
                                                                }
                                                                i9++;
                                                                objArr = objArr2;
                                                                jArr5 = jArr6;
                                                                jArr4 = jArr2;
                                                                i8 = 8;
                                                            }
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j = j3;
                                                        }
                                                        z = mutableScatterSet.isEmpty();
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j = j3;
                                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        z = !((RecomposeScopeImpl) obj2).getValid();
                                                    }
                                                    if (z) {
                                                        mutableScatterMap.removeValueAt(i7);
                                                    }
                                                    i = 8;
                                                } else {
                                                    jArr2 = jArr4;
                                                    j = j3;
                                                    c = c2;
                                                    j2 = j4;
                                                    i = i4;
                                                }
                                                j3 = j >> i;
                                                i6++;
                                                i4 = i;
                                                c2 = c;
                                                j4 = j2;
                                                jArr4 = jArr2;
                                            }
                                            jArr = jArr4;
                                            if (i5 != i4) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr4;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                        jArr4 = jArr;
                                        i2 = 0;
                                    }
                                }
                                cleanUpDerivedStateObservations();
                                Unit unit2 = Unit.INSTANCE;
                                Trace.INSTANCE.endSection(beginSection);
                            } finally {
                                Trace.INSTANCE.endSection(beginSection);
                            }
                        }
                        try {
                            if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                                this.rememberManager.dispatchAbandons();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        openWriter.close(false);
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                    this.rememberManager.dispatchAbandons();
                }
                throw th3;
            } finally {
            }
        }
    }

    private final void cleanUpDerivedStateObservations() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean z;
        long[] jArr3;
        int i3;
        int i4;
        MutableScatterMap<Object, Object> mutableScatterMap = this.derivedStates;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            long j8 = 128;
            while (true) {
                long j9 = jArr4[i6];
                j2 = 255;
                if ((((~j9) << c3) & j9 & j7) != j7) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j9 & 255) < j8) {
                            c2 = c3;
                            int i9 = (i6 << 3) + i8;
                            j5 = j7;
                            Object obj = mutableScatterMap.keys[i9];
                            Object obj2 = mutableScatterMap.values[i9];
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr5 = mutableScatterSet.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i10 = 0;
                                    int i11 = i5;
                                    while (true) {
                                        int i12 = length2;
                                        long j10 = jArr5[i10];
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i10 - i12)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & 255) < j6) {
                                                    jArr3 = jArr4;
                                                    int i15 = (i10 << 3) + i14;
                                                    i3 = i14;
                                                    i4 = i8;
                                                    if (!ScopeMap.m209containsimpl(this.observations, (DerivedState) objArr[i15])) {
                                                        mutableScatterSet.removeElementAt(i15);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i3 = i14;
                                                    i4 = i8;
                                                }
                                                j10 >>= i11;
                                                i14 = i3 + 1;
                                                i8 = i4;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i = i8;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i = i8;
                                        }
                                        length2 = i12;
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        j9 = j4;
                                        i8 = i;
                                        jArr4 = jArr2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                z = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr4;
                                j4 = j9;
                                i = i8;
                                j6 = j8;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                z = !ScopeMap.m209containsimpl(this.observations, (DerivedState) obj2);
                            }
                            if (z) {
                                mutableScatterMap.removeValueAt(i9);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr4;
                            j4 = j9;
                            i = i8;
                            c2 = c3;
                            j5 = j7;
                            j6 = j8;
                            i2 = i5;
                        }
                        j9 = j4 >> i2;
                        i8 = i + 1;
                        i5 = i2;
                        c3 = c2;
                        j7 = j5;
                        j8 = j6;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c = c3;
                    j = j7;
                    j3 = j8;
                    if (i7 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c = c3;
                    j = j7;
                    j3 = j8;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                c3 = c;
                j7 = j;
                j8 = j3;
                jArr4 = jArr;
                i5 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.isNotEmpty()) {
            return;
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = mutableScatterSet2.elements;
        long[] jArr6 = mutableScatterSet2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j11 = jArr6[i16];
            if ((((~j11) << c) & j11 & j) != j) {
                int i17 = 8 - ((~(i16 - length3)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((j11 & j2) < j3) {
                        int i19 = (i16 << 3) + i18;
                        if (!((RecomposeScopeImpl) objArr2[i19]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i19);
                        }
                    }
                    j11 >>= 8;
                }
                if (i17 != 8) {
                    return;
                }
            }
            if (i16 == length3) {
                return;
            } else {
                i16++;
            }
        }
    }

    private final boolean clearDeactivated() {
        boolean z;
        synchronized (this.lock) {
            z = true;
            if (this.state != 1) {
                z = false;
            }
            if (z) {
                this.state = 0;
            }
        }
        return z;
    }

    private final void composeInitial(Function2<? super Composer, ? super Integer, Unit> content) {
        this.composable = content;
        this.parent.composeInitial$runtime(this, content);
    }

    private final PausedComposition composeInitialPaused(boolean reusable, Function2<? super Composer, ? super Integer, Unit> content) {
        if (this.pendingPausedComposition != null) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, content, reusable, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    private final void composeInitialWithReuse(Function2<? super Composer, ? super Integer, Unit> content) {
        this.composer.startReuseFromRoot();
        composeInitial(content);
        this.composer.endReuseFromRoot();
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object obj;
        Object obj2;
        AtomicReference<Object> atomicReference = this.pendingModifications;
        obj = CompositionKt.PendingApplyNoModifications;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = CompositionKt.PendingApplyNoModifications;
            if (Intrinsics.areEqual(andSet, obj2)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(null);
        obj = CompositionKt.PendingApplyNoModifications;
        if (Intrinsics.areEqual(andSet, obj)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(SetsKt.emptySet());
        obj = CompositionKt.PendingApplyNoModifications;
        if (Intrinsics.areEqual(andSet, obj) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            addPendingInvalidationsLocked(set, false);
        }
    }

    private final void ensureRunning() {
        int i = this.state;
        if (!(i == 0)) {
            PreconditionsKt.throwIllegalStateException(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.pendingPausedComposition == null) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    }

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime();
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime$annotations() {
    }

    private final <T> T guardChanges(Function0<? extends T> block) {
        try {
            try {
                T invoke = block.invoke();
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return invoke;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        InlineMarker.finallyStart(1);
                        rememberEventDispatcher.clear();
                        InlineMarker.finallyEnd(1);
                    } catch (Throwable th2) {
                        InlineMarker.finallyStart(1);
                        rememberEventDispatcher.clear();
                        InlineMarker.finallyEnd(1);
                        throw th2;
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th;
            }
        } catch (Throwable th3) {
            abandonChanges();
            throw th3;
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super ScopeMap<RecomposeScopeImpl, Object>, ? extends T> block) {
        MutableScatterMap<Object, Object> m52takeInvalidationsafanTW4 = m52takeInvalidationsafanTW4();
        try {
            return block.invoke(ScopeMap.m205boximpl(m52takeInvalidationsafanTW4));
        } catch (Throwable th) {
            this.invalidations = m52takeInvalidationsafanTW4;
            throw th;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        int i;
        synchronized (this.lock) {
            try {
                CompositionImpl compositionImpl = this.invalidationDelegate;
                CompositionImpl compositionImpl2 = null;
                if (compositionImpl != null) {
                    if (!this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                        compositionImpl = null;
                    }
                    compositionImpl2 = compositionImpl;
                }
                if (compositionImpl2 == null) {
                    if (tryImminentInvalidation(scope, instance)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (instance == null) {
                        ScopeMap.m219setimpl(this.invalidations, scope, ScopeInvalidated.INSTANCE);
                    } else if (instance instanceof DerivedState) {
                        Object obj = this.invalidations.get(scope);
                        if (obj != null) {
                            if (obj instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr = mutableScatterSet.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8;
                                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                                            int i5 = 0;
                                            while (i5 < i4) {
                                                if ((j & 255) < 128) {
                                                    i = i3;
                                                    if (objArr[(i2 << 3) + i5] == ScopeInvalidated.INSTANCE) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i = i3;
                                                }
                                                j >>= i;
                                                i5++;
                                                i3 = i;
                                            }
                                            if (i4 != i3) {
                                                break;
                                            }
                                        }
                                        if (i2 == length) {
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            } else if (obj == ScopeInvalidated.INSTANCE) {
                            }
                        }
                        ScopeMap.m202addimpl(this.invalidations, scope, instance);
                    } else {
                        ScopeMap.m219setimpl(this.invalidations, scope, ScopeInvalidated.INSTANCE);
                    }
                }
                if (compositionImpl2 != null) {
                    return compositionImpl2.invalidateChecked(scope, anchor, instance);
                }
                this.parent.invalidate$runtime(this);
                return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void invalidateScopeOfLocked(Object value) {
        Object obj = this.observations.get(value);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
            if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                ScopeMap.m202addimpl(this.observationsProcessed, value, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                        if (recomposeScopeImpl2.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                            ScopeMap.m202addimpl(this.observationsProcessed, value, recomposeScopeImpl2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final CompositionObserver observer() {
        return this.observerHolder.current();
    }

    /* renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final MutableScatterMap<Object, Object> m52takeInvalidationsafanTW4() {
        MutableScatterMap<Object, Object> mutableScatterMap = this.invalidations;
        this.invalidations = ScopeMap.m208constructorimpl$default(null, 1, null);
        return mutableScatterMap;
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> block) {
        try {
            T invoke = block.invoke();
            InlineMarker.finallyStart(1);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                try {
                    rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                    rememberEventDispatcher.dispatchAbandons();
                } finally {
                    InlineMarker.finallyStart(1);
                    rememberEventDispatcher.clear();
                    InlineMarker.finallyEnd(1);
                }
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl scope, Object instance) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime(scope, instance);
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                PreconditionsKt.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2));
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            rememberEventDispatcher.dispatchAbandons();
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        RememberEventDispatcher rememberEventDispatcher;
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime();
                if (!this.abandonSet.isEmpty()) {
                    rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } finally {
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    abandonChanges();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(Function2<? super Composer, ? super Integer, Unit> content) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                try {
                    this.composer.m49composeContentZbOJvo$runtime(m52takeInvalidationsafanTW4(), content, this.shouldPause);
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }

    public final int composerStacksSizes$runtime() {
        return this.composer.stacksSize$runtime();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            try {
                if (!(this.pendingPausedComposition == null)) {
                    PreconditionsKt.throwIllegalStateException("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || !this.abandonSet.isEmpty()) {
                    Trace trace = Trace.INSTANCE;
                    Object beginSection = trace.beginSection("Compose:deactivate");
                    try {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            if (z) {
                                this.applier.onBeginChanges();
                                SlotWriter openWriter = this.slotTable.openWriter();
                                try {
                                    ComposerKt.deactivateCurrentGroup(openWriter, this.rememberManager);
                                    Unit unit = Unit.INSTANCE;
                                    openWriter.close(true);
                                    this.applier.onEndChanges();
                                    rememberEventDispatcher.dispatchRememberObservers();
                                } catch (Throwable th) {
                                    openWriter.close(false);
                                    throw th;
                                }
                            }
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                            Unit unit2 = Unit.INSTANCE;
                            trace.endSection(beginSection);
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.INSTANCE.endSection(beginSection);
                        throw th3;
                    }
                }
                ScopeMap.m206clearimpl(this.observations);
                ScopeMap.m206clearimpl(this.derivedStates);
                ScopeMap.m206clearimpl(this.invalidations);
                this.changes.clear();
                this.lateChanges.clear();
                this.composer.deactivate$runtime();
                this.state = 1;
                Unit unit3 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition to, int groupIndex, Function0<? extends R> block) {
        if (to == null || Intrinsics.areEqual(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.state != 3) {
                    this.state = 3;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$1918065384$runtime();
                    ChangeList deferredChanges = this.composer.getDeferredChanges();
                    if (deferredChanges != null) {
                        applyChangesInLocked(deferredChanges);
                    }
                    boolean z = this.slotTable.getGroupsSize() > 0;
                    if (z || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            if (z) {
                                this.applier.onBeginChanges();
                                SlotWriter openWriter = this.slotTable.openWriter();
                                try {
                                    ComposerKt.removeCurrentGroup(openWriter, this.rememberManager);
                                    Unit unit = Unit.INSTANCE;
                                    openWriter.close(true);
                                    this.applier.clear();
                                    this.applier.onEndChanges();
                                    rememberEventDispatcher.dispatchRememberObservers();
                                } catch (Throwable th) {
                                    openWriter.close(false);
                                    throw th;
                                }
                            }
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    this.composer.dispose$runtime();
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.parent.unregisterComposition$runtime(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState state) {
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            SlotWriter openWriter = state.getSlotTable().openWriter();
            try {
                ComposerKt.removeCurrentGroup(openWriter, this.rememberManager);
                Unit unit = Unit.INSTANCE;
                openWriter.close(true);
                rememberEventDispatcher.dispatchRememberObservers();
            } catch (Throwable th) {
                openWriter.close(false);
                throw th;
            }
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    public final List<Pair<RecomposeScopeImpl, Object>> extractInvalidationsOf$runtime(Anchor anchor) {
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j;
        char c;
        long j2;
        int i3;
        boolean z;
        Object[] objArr;
        int i4;
        long j3;
        Object[] objArr2;
        if (ScopeMap.m213getSizeimpl(this.invalidations) <= 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        SlotTable slotTable = this.slotTable;
        MutableScatterMap<Object, Object> mutableScatterMap = this.invalidations;
        long[] jArr3 = mutableScatterMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j4 = jArr3[i5];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j4 & 255) < 128) {
                            c = c2;
                            int i9 = (i5 << 3) + i8;
                            j2 = j5;
                            Object obj = mutableScatterMap.keys[i9];
                            Object obj2 = mutableScatterMap.values[i9];
                            int i10 = i6;
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr3 = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                jArr2 = jArr3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j = j4;
                                    int i11 = 0;
                                    while (true) {
                                        long j6 = jArr4[i11];
                                        i = length;
                                        i2 = i8;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j6 & 255) < 128) {
                                                    i4 = i13;
                                                    int i14 = (i11 << 3) + i4;
                                                    j3 = j6;
                                                    Object obj3 = objArr3[i14];
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                                                    objArr2 = objArr3;
                                                    Anchor anchor2 = recomposeScopeImpl.getAnchor();
                                                    if (anchor2 != null && slotTable.inGroup(anchor, anchor2)) {
                                                        arrayList.add(TuplesKt.to(recomposeScopeImpl, obj3));
                                                        mutableScatterSet.removeElementAt(i14);
                                                    }
                                                } else {
                                                    i4 = i13;
                                                    j3 = j6;
                                                    objArr2 = objArr3;
                                                }
                                                j6 = j3 >> i10;
                                                i13 = i4 + 1;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        length = i;
                                        i8 = i2;
                                        objArr3 = objArr;
                                        i10 = 8;
                                    }
                                } else {
                                    i = length;
                                    i2 = i8;
                                    j = j4;
                                }
                                z = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i8;
                                j = j4;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
                                Anchor anchor3 = recomposeScopeImpl2.getAnchor();
                                if (anchor3 == null || !slotTable.inGroup(anchor, anchor3)) {
                                    z = false;
                                } else {
                                    arrayList.add(TuplesKt.to(recomposeScopeImpl2, obj2));
                                    z = true;
                                }
                            }
                            if (z) {
                                mutableScatterMap.removeValueAt(i9);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i8;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i3 = i6;
                        }
                        j4 = j >> i3;
                        i6 = i3;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                        length = i;
                        i8 = i2 + 1;
                    }
                    jArr = jArr3;
                    int i15 = length;
                    if (i7 != i6) {
                        break;
                    }
                    length = i15;
                } else {
                    jArr = jArr3;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPause) {
        ShouldPauseCallback shouldPauseCallback = this.shouldPause;
        this.shouldPause = shouldPause;
        return shouldPauseCallback;
    }

    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    /* renamed from: getComposer$runtime, reason: from getter */
    public final ComposerImpl getComposer() {
        return this.composer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> key) {
        if (Intrinsics.areEqual(key, CompositionKt.getObservableCompositionServiceKey())) {
            return this;
        }
        return null;
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime() {
        return CollectionsKt.toList(this.conditionallyInvalidatedScopes.asSet());
    }

    public final Set<Object> getDerivedStateDependencies$runtime() {
        return this.derivedStates.asMap().keySet();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = ScopeMap.m213getSizeimpl(this.invalidations) > 0;
        }
        return z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime;
        synchronized (this.lock) {
            hasPendingChanges$runtime = this.composer.getHasPendingChanges$runtime();
        }
        return hasPendingChanges$runtime;
    }

    public final Set<Object> getObservedObjects$runtime() {
        return this.observations.asMap().keySet();
    }

    /* renamed from: getObserverHolder$runtime, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    public final CompositionContext getParent() {
        return this.parent;
    }

    /* renamed from: getPendingInvalidScopes$runtime, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime() : coroutineContext;
    }

    /* renamed from: getSlotTable$runtime, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.areEqual(references.get(i).getFirst().getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        try {
            this.composer.insertMovableContentReferences(references);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl scope, Object instance) {
        CompositionObserver observer;
        CompositionImpl compositionImpl;
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotTable.ownsAnchor(anchor)) {
            synchronized (this.lock) {
                compositionImpl = this.invalidationDelegate;
            }
            return (compositionImpl == null || !compositionImpl.tryImminentInvalidation(scope, instance)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
        }
        if (!scope.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        InvalidationResult invalidateChecked = invalidateChecked(scope, anchor, instance);
        if (invalidateChecked != InvalidationResult.IGNORED && (observer = observer()) != null) {
            observer.onScopeInvalidated(scope, instance);
        }
        return invalidateChecked;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void invalidateGroupsWithKey(int key) {
        List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime;
        synchronized (this.lock) {
            invalidateGroupsWithKey$runtime = this.slotTable.invalidateGroupsWithKey$runtime(key);
        }
        if (invalidateGroupsWithKey$runtime != null) {
            int size = invalidateGroupsWithKey$runtime.size();
            for (int i = 0; i < size; i++) {
                if (invalidateGroupsWithKey$runtime.get(i).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime()) {
            this.parent.invalidate$runtime(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.state == 3;
    }

    /* renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean observesAnyOf(Set<? extends Object> values) {
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set$runtime = ((ScatterSetWrapper) values).getSet$runtime();
            Object[] objArr = set$runtime.elements;
            long[] jArr = set$runtime.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (ScopeMap.m209containsimpl(this.observations, obj) || ScopeMap.m209containsimpl(this.derivedStates, obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : values) {
                if (ScopeMap.m209containsimpl(this.observations, obj2) || ScopeMap.m209containsimpl(this.derivedStates, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void pausedCompositionFinished$runtime(ScatterSet<RememberObserverHolder> ignoreSet) {
        this.pendingPausedComposition = null;
        if (ignoreSet != null) {
            this.rememberManager.ignoreForgotten(ignoreSet);
            this.state = 2;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(Function0<Unit> block) {
        this.composer.prepareCompose$runtime(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        synchronized (this.lock) {
            PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
            if (pausedCompositionImpl != null && !pausedCompositionImpl.isRecomposing$runtime()) {
                pausedCompositionImpl.markIncomplete$runtime();
                return false;
            }
            drainPendingModificationsForCompositionLocked();
            try {
                MutableScatterMap<Object, Object> m52takeInvalidationsafanTW4 = m52takeInvalidationsafanTW4();
                try {
                    boolean m50recomposeaFTiNEg$runtime = this.composer.m50recomposeaFTiNEg$runtime(m52takeInvalidationsafanTW4, this.shouldPause);
                    if (!m50recomposeaFTiNEg$runtime) {
                        drainPendingModificationsLocked();
                    }
                    return m50recomposeaFTiNEg$runtime;
                } catch (Throwable th) {
                    this.invalidations = m52takeInvalidationsafanTW4;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th3) {
                            rememberEventDispatcher.clear();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    abandonChanges();
                    throw th4;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
        CompositionObserver observer = observer();
        if (observer != null) {
            observer.onScopeDisposed(scope);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void recordModificationsOf(Set<? extends Object> values) {
        Set<? extends Object> set;
        AtomicReference<Object> atomicReference;
        Object obj;
        while (true) {
            Object obj2 = this.pendingModifications.get();
            if (obj2 != null) {
                obj = CompositionKt.PendingApplyNoModifications;
                if (!Intrinsics.areEqual(obj2, obj)) {
                    if (obj2 instanceof Set) {
                        set = new Set[]{obj2, values};
                    } else {
                        if (!(obj2 instanceof Object[])) {
                            throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                        }
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                        set = ArraysKt.plus((Set<? extends Object>[]) obj2, values);
                    }
                    atomicReference = this.pendingModifications;
                    while (!atomicReference.compareAndSet(obj2, set)) {
                        if (atomicReference.get() != obj2) {
                            break;
                        }
                    }
                    if (obj2 != null) {
                        synchronized (this.lock) {
                            drainPendingModificationsLocked();
                            Unit unit = Unit.INSTANCE;
                        }
                        return;
                    }
                    return;
                }
            }
            set = values;
            atomicReference = this.pendingModifications;
            while (!atomicReference.compareAndSet(obj2, set)) {
            }
            if (obj2 != null) {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        int i;
        int i2;
        int i3;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime = this.composer.getCurrentRecomposeScope$runtime()) == null) {
            return;
        }
        int i4 = 1;
        currentRecomposeScope$runtime.setUsed(true);
        boolean recordRead = currentRecomposeScope$runtime.recordRead(value);
        CompositionObserver observer = observer();
        if (observer != null) {
            observer.onReadInScope(currentRecomposeScope$runtime, value);
        }
        if (recordRead) {
            return;
        }
        if (value instanceof StateObjectImpl) {
            ((StateObjectImpl) value).m241recordReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(1));
        }
        ScopeMap.m202addimpl(this.observations, value, currentRecomposeScope$runtime);
        if (value instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) value;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            ScopeMap.m217removeScopeimpl(this.derivedStates, value);
            ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr = dependencies.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j = jArr[i5];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j & 255) < 128) {
                                i2 = i4;
                                StateObject stateObject = (StateObject) objArr[(i5 << 3) + i8];
                                if (stateObject instanceof StateObjectImpl) {
                                    i3 = i6;
                                    ((StateObjectImpl) stateObject).m241recordReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(i2));
                                } else {
                                    i3 = i6;
                                }
                                ScopeMap.m202addimpl(this.derivedStates, stateObject, value);
                            } else {
                                i2 = i4;
                                i3 = i6;
                            }
                            j >>= i3;
                            i8++;
                            i4 = i2;
                            i6 = i3;
                        }
                        i = i4;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        i = i4;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    i4 = i;
                }
            }
            currentRecomposeScope$runtime.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object value) {
        synchronized (this.lock) {
            try {
                invalidateScopeOfLocked(value);
                Object obj = this.derivedStates.get(value);
                if (obj != null) {
                    if (obj instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                        Object[] objArr = mutableScatterSet.elements;
                        long[] jArr = mutableScatterSet.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            invalidateScopeOfLocked((DerivedState) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        invalidateScopeOfLocked((DerivedState) obj);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeDerivedStateObservation$runtime(DerivedState<?> state) {
        if (ScopeMap.m209containsimpl(this.observations, state)) {
            return;
        }
        ScopeMap.m217removeScopeimpl(this.derivedStates, state);
    }

    public final void removeObservation$runtime(Object instance, RecomposeScopeImpl scope) {
        ScopeMap.m215removeimpl(this.observations, instance, scope);
    }

    public final void setComposable(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(Function2<? super Composer, ? super Integer, Unit> content) {
        boolean clearDeactivated = clearDeactivated();
        ensureRunning();
        if (clearDeactivated) {
            composeInitialWithReuse(content);
        } else {
            composeInitial(content);
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(Function2<? super Composer, ? super Integer, Unit> content) {
        clearDeactivated();
        ensureRunning();
        composeInitialWithReuse(content);
    }

    @Override // androidx.compose.runtime.tooling.ObservableComposition
    public CompositionObserverHandle setObserver(final CompositionObserver observer) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(observer);
            this.observerHolder.setRoot(true);
            Unit unit = Unit.INSTANCE;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$setObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj;
                obj = CompositionImpl.this.lock;
                CompositionImpl compositionImpl = CompositionImpl.this;
                CompositionObserver compositionObserver = observer;
                synchronized (obj) {
                    try {
                        if (Intrinsics.areEqual(compositionImpl.getObserverHolder().getObserver(), compositionObserver)) {
                            compositionImpl.getObserverHolder().setObserver(null);
                            compositionImpl.getObserverHolder().setRoot(false);
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContent(Function2<? super Composer, ? super Integer, Unit> content) {
        return composeInitialPaused(clearDeactivated(), content);
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContentWithReuse(Function2<? super Composer, ? super Integer, Unit> content) {
        clearDeactivated();
        ensureRunning();
        return composeInitialPaused(true, content);
    }

    public final void setPendingInvalidScopes$runtime(boolean z) {
        this.pendingInvalidScopes = z;
    }

    public final void updateMovingInvalidations$runtime() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            MutableScatterMap<Object, Object> m52takeInvalidationsafanTW4 = m52takeInvalidationsafanTW4();
            try {
                this.composer.m51updateComposerInvalidationsRY85e9Y(m52takeInvalidationsafanTW4);
                Unit unit = Unit.INSTANCE;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            try {
                if (!isComposing()) {
                    this.composer.verifyConsistent$runtime();
                    this.slotTable.verifyWellFormed();
                    validateRecomposeScopeAnchors(this.slotTable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void addPendingInvalidationsLocked(Set<? extends Object> values, boolean forgetConditionalScopes) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        long j4;
        boolean contains;
        long j5;
        long[] jArr3;
        int i;
        long[] jArr4;
        int i2;
        int i3;
        long j6;
        boolean z;
        int i4;
        long j7;
        long j8;
        char c2;
        long j9;
        int i5;
        int i6;
        int i7;
        Object obj = null;
        char c3 = 7;
        long j10 = -9187201950435737472L;
        int i8 = 8;
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set$runtime = ((ScatterSetWrapper) values).getSet$runtime();
            Object[] objArr = set$runtime.elements;
            long[] jArr5 = set$runtime.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i9 = 0;
                j2 = 128;
                while (true) {
                    long j11 = jArr5[i9];
                    j3 = 255;
                    if ((((~j11) << c3) & j11 & j10) != j10) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j11 & 255) < 128) {
                                c2 = c3;
                                Object obj2 = objArr[(i9 << 3) + i11];
                                j9 = j10;
                                if (obj2 instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj2).invalidateForResult(obj);
                                    j8 = j11;
                                    i5 = length;
                                } else {
                                    addPendingInvalidationsLocked(obj2, forgetConditionalScopes);
                                    Object obj3 = this.derivedStates.get(obj2);
                                    if (obj3 != null) {
                                        if (obj3 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                                            Object[] objArr2 = mutableScatterSet.elements;
                                            long[] jArr6 = mutableScatterSet.metadata;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                j8 = j11;
                                                int i12 = 0;
                                                while (true) {
                                                    long j12 = jArr6[i12];
                                                    int i13 = i8;
                                                    i5 = length;
                                                    if ((((~j12) << c2) & j12 & j9) != j9) {
                                                        int i14 = 8 - ((~(i12 - length2)) >>> 31);
                                                        int i15 = 0;
                                                        while (i15 < i14) {
                                                            if ((j12 & 255) < 128) {
                                                                i7 = i13;
                                                                addPendingInvalidationsLocked((DerivedState) objArr2[(i12 << 3) + i15], forgetConditionalScopes);
                                                            } else {
                                                                i7 = i13;
                                                            }
                                                            j12 >>= i7;
                                                            i15++;
                                                            i13 = i7;
                                                        }
                                                        if (i14 != i13) {
                                                            break;
                                                        }
                                                    }
                                                    if (i12 == length2) {
                                                        break;
                                                    }
                                                    i12++;
                                                    length = i5;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            j8 = j11;
                                            i5 = length;
                                            addPendingInvalidationsLocked((DerivedState) obj3, forgetConditionalScopes);
                                        }
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    j8 = j11;
                                    i5 = length;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                i6 = 8;
                            } else {
                                j8 = j11;
                                c2 = c3;
                                j9 = j10;
                                i5 = length;
                                i6 = i8;
                            }
                            i11++;
                            length = i5;
                            i8 = i6;
                            c3 = c2;
                            j10 = j9;
                            j11 = j8 >> i6;
                            obj = null;
                        }
                        c = c3;
                        j = j10;
                        int i16 = length;
                        if (i10 != i8) {
                            break;
                        } else {
                            length = i16;
                        }
                    } else {
                        c = c3;
                        j = j10;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                    c3 = c;
                    j10 = j;
                    obj = null;
                    i8 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            for (Object obj4 : values) {
                if (obj4 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj4).invalidateForResult(null);
                } else {
                    addPendingInvalidationsLocked(obj4, forgetConditionalScopes);
                    Object obj5 = this.derivedStates.get(obj4);
                    if (obj5 != null) {
                        if (obj5 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj5;
                            Object[] objArr3 = mutableScatterSet2.elements;
                            long[] jArr7 = mutableScatterSet2.metadata;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i17 = 0;
                                while (true) {
                                    long j13 = jArr7[i17];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                        for (int i19 = 0; i19 < i18; i19++) {
                                            if ((j13 & 255) < 128) {
                                                addPendingInvalidationsLocked((DerivedState) objArr3[(i17 << 3) + i19], forgetConditionalScopes);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i18 != 8) {
                                            break;
                                        }
                                    }
                                    if (i17 == length3) {
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        } else {
                            addPendingInvalidationsLocked((DerivedState) obj5, forgetConditionalScopes);
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
            }
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet3 = this.conditionallyInvalidatedScopes;
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet4 = this.invalidatedScopes;
        String str3 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (forgetConditionalScopes && mutableScatterSet3.isNotEmpty()) {
            MutableScatterMap<Object, Object> mutableScatterMap = this.observations;
            long[] jArr8 = mutableScatterMap.metadata;
            int length4 = jArr8.length - 2;
            if (length4 >= 0) {
                int i20 = 0;
                while (true) {
                    long j14 = jArr8[i20];
                    if ((((~j14) << c) & j14 & j) != j) {
                        int i21 = 8 - ((~(i20 - length4)) >>> 31);
                        int i22 = 0;
                        while (i22 < i21) {
                            if ((j14 & j3) < j2) {
                                int i23 = (i20 << 3) + i22;
                                Object obj6 = mutableScatterMap.keys[i23];
                                Object obj7 = mutableScatterMap.values[i23];
                                if (obj7 instanceof MutableScatterSet) {
                                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                    MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj7;
                                    Object[] objArr4 = mutableScatterSet5.elements;
                                    long[] jArr9 = mutableScatterSet5.metadata;
                                    jArr4 = jArr8;
                                    int length5 = jArr9.length - 2;
                                    if (length5 >= 0) {
                                        j6 = j14;
                                        int i24 = 0;
                                        while (true) {
                                            long j15 = jArr9[i24];
                                            i2 = length4;
                                            i3 = i20;
                                            if ((((~j15) << c) & j15 & j) != j) {
                                                int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                                for (int i26 = 0; i26 < i25; i26 = i4 + 1) {
                                                    if ((j15 & j3) < j2) {
                                                        i4 = i26;
                                                        int i27 = (i24 << 3) + i4;
                                                        j7 = j15;
                                                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr4[i27];
                                                        if (mutableScatterSet3.contains(recomposeScopeImpl) || mutableScatterSet4.contains(recomposeScopeImpl)) {
                                                            mutableScatterSet5.removeElementAt(i27);
                                                        }
                                                    } else {
                                                        i4 = i26;
                                                        j7 = j15;
                                                    }
                                                    j15 = j7 >> 8;
                                                }
                                                if (i25 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i24 == length5) {
                                                break;
                                            }
                                            i24++;
                                            length4 = i2;
                                            i20 = i3;
                                        }
                                    } else {
                                        i2 = length4;
                                        i3 = i20;
                                        j6 = j14;
                                    }
                                    z = mutableScatterSet5.isEmpty();
                                } else {
                                    jArr4 = jArr8;
                                    i2 = length4;
                                    i3 = i20;
                                    j6 = j14;
                                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj7;
                                    z = mutableScatterSet3.contains(recomposeScopeImpl2) || mutableScatterSet4.contains(recomposeScopeImpl2);
                                }
                                if (z) {
                                    mutableScatterMap.removeValueAt(i23);
                                }
                            } else {
                                jArr4 = jArr8;
                                i2 = length4;
                                i3 = i20;
                                j6 = j14;
                            }
                            j14 = j6 >> 8;
                            i22++;
                            length4 = i2;
                            jArr8 = jArr4;
                            i20 = i3;
                        }
                        jArr3 = jArr8;
                        int i28 = length4;
                        int i29 = i20;
                        if (i21 != 8) {
                            break;
                        }
                        length4 = i28;
                        i = i29;
                    } else {
                        jArr3 = jArr8;
                        i = i20;
                    }
                    if (i == length4) {
                        break;
                    }
                    i20 = i + 1;
                    jArr8 = jArr3;
                }
            }
            mutableScatterSet3.clear();
            cleanUpDerivedStateObservations();
            return;
        }
        if (mutableScatterSet4.isNotEmpty()) {
            MutableScatterMap<Object, Object> mutableScatterMap2 = this.observations;
            long[] jArr10 = mutableScatterMap2.metadata;
            int length6 = jArr10.length - 2;
            if (length6 >= 0) {
                int i30 = 0;
                while (true) {
                    long j16 = jArr10[i30];
                    if ((((~j16) << c) & j16 & j) != j) {
                        int i31 = 8 - ((~(i30 - length6)) >>> 31);
                        int i32 = 0;
                        while (i32 < i31) {
                            if ((j16 & j3) < j2) {
                                int i33 = (i30 << 3) + i32;
                                Object obj8 = mutableScatterMap2.keys[i33];
                                Object obj9 = mutableScatterMap2.values[i33];
                                if (obj9 instanceof MutableScatterSet) {
                                    Intrinsics.checkNotNull(obj9, str3);
                                    MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj9;
                                    Object[] objArr5 = mutableScatterSet6.elements;
                                    long[] jArr11 = mutableScatterSet6.metadata;
                                    int length7 = jArr11.length - 2;
                                    jArr2 = jArr10;
                                    str2 = str3;
                                    if (length7 >= 0) {
                                        int i34 = 0;
                                        while (true) {
                                            long j17 = jArr11[i34];
                                            j4 = j16;
                                            if ((((~j17) << c) & j17 & j) != j) {
                                                int i35 = 8 - ((~(i34 - length7)) >>> 31);
                                                int i36 = 0;
                                                while (i36 < i35) {
                                                    if ((j17 & j3) < j2) {
                                                        j5 = j17;
                                                        int i37 = (i34 << 3) + i36;
                                                        if (mutableScatterSet4.contains((RecomposeScopeImpl) objArr5[i37])) {
                                                            mutableScatterSet6.removeElementAt(i37);
                                                        }
                                                    } else {
                                                        j5 = j17;
                                                    }
                                                    i36++;
                                                    j17 = j5 >> 8;
                                                }
                                                if (i35 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i34 == length7) {
                                                break;
                                            }
                                            i34++;
                                            j16 = j4;
                                        }
                                    } else {
                                        j4 = j16;
                                    }
                                    contains = mutableScatterSet6.isEmpty();
                                } else {
                                    jArr2 = jArr10;
                                    str2 = str3;
                                    j4 = j16;
                                    Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    contains = mutableScatterSet4.contains((RecomposeScopeImpl) obj9);
                                }
                                if (contains) {
                                    mutableScatterMap2.removeValueAt(i33);
                                }
                            } else {
                                jArr2 = jArr10;
                                str2 = str3;
                                j4 = j16;
                            }
                            j16 = j4 >> 8;
                            i32++;
                            jArr10 = jArr2;
                            str3 = str2;
                        }
                        jArr = jArr10;
                        str = str3;
                        if (i31 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr10;
                        str = str3;
                    }
                    if (i30 == length6) {
                        break;
                    }
                    i30++;
                    jArr10 = jArr;
                    str3 = str;
                }
            }
            cleanUpDerivedStateObservations();
            mutableScatterSet4.clear();
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }
}
