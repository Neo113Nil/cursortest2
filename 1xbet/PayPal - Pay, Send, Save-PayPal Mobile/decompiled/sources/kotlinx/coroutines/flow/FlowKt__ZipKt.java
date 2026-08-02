package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\u001aq\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000322\u0010\t\u001a.\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\n\u0010\u000b\u001au\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u000322\u0010\f\u001a.\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\r\u0010\u000b\u001a\u0096\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032W\u0010\t\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009a\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032W\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0085\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032.\u0010\u0019\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e¢\u0006\u0004\b\r\u0010\u001a\u001a\u0096\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032?\u0010\u0019\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001b¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0017\u0010\u001c\u001a\u009f\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001d\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\u001e\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001b¢\u0006\u0004\b\r\u0010\u001f\u001a°\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001d\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032E\u0010\u001e\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0 ¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0017\u0010!\u001a¹\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001d\"\u0004\b\u0004\u0010\"\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010#\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0 ¢\u0006\u0004\b\r\u0010$\u001aÊ\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001d\"\u0004\b\u0004\u0010\"\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032K\u0010#\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0%¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0017\u0010&\u001ap\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010'\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030(\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0)H\u0086\b¢\u0006\u0004\b\r\u0010*\u001a\u0081\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010'\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030(\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0004\u0010\t\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b\u0017\u0010+\u001ad\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010'\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030,2*\b\u0004\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0)H\u0086\b¢\u0006\u0004\b\r\u0010-\u001au\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010'\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030,2;\b\u0004\u0010\t\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b\u0017\u0010.\u001ag\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b/\u0010\u000b"}, d2 = {"T1", "T2", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/Flow;", "p0", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "p1", "flowCombine", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "p2", "combine", "Lkotlin/Function4;", "Lkotlinx/coroutines/flow/FlowCollector;", "name", "a", util.h.xy.cb.b.f1091, "", "Lkotlin/ExtensionFunctionType;", "flowCombineTransform", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "combineTransform", "T3", "p3", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function5;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "T4", "p4", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function6;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "T5", "p5", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function7;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function7;)Lkotlinx/coroutines/flow/Flow;", "T", "", "Lkotlin/Function2;", "([Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "([Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "zip"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__ZipKt {
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.flow.FlowKt.flowCombine(flow, flow2, function3);
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> flowCombineTransform(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4) {
        return kotlinx.coroutines.flow.FlowKt.flow(new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new kotlinx.coroutines.flow.Flow[]{flow, flow2}, null, function4));
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4) {
        return kotlinx.coroutines.flow.FlowKt.flow(new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new kotlinx.coroutines.flow.Flow[]{flow, flow2}, null, function4));
    }

    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlinx.coroutines.flow.Flow<? extends T3> flow3, final kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function4) {
        final kotlinx.coroutines.flow.Flow[] flowArr = {flow, flow2, flow3};
        return new kotlinx.coroutines.flow.Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                kotlin.jvm.functions.Function0 function0;
                kotlinx.coroutines.flow.Flow[] flowArr2 = flowArr;
                function0 = new kotlin.jvm.functions.Function0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Void invoke() {
                        return null;
                    }
                };
                java.lang.Object combineInternal = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr2, function0, new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2(null, function4), continuation);
                return combineInternal == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, java.lang.Object[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlin.jvm.functions.Function4 getHighSpeedVideoFpsRanges;
                int getHighSpeedVideoSizes;

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
                
                    if (r1.emit(r8, r7) == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
                
                    if (r8 != r0) goto L12;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighSpeedVideoSizes;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object[] objArr = (java.lang.Object[]) this.Camera2StreamConfigurationMap;
                        kotlin.jvm.functions.Function4 function4 = this.getHighSpeedVideoFpsRanges;
                        java.lang.Object obj2 = objArr[0];
                        java.lang.Object obj3 = objArr[1];
                        java.lang.Object obj4 = objArr[2];
                        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                        this.getHighSpeedVideoSizes = 1;
                        obj = function4.invoke(obj2, obj3, obj4, this);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoSizes = 2;
                }

                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2 anonymousClass2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2(continuation, this.getHighSpeedVideoFpsRanges);
                    anonymousClass2.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    anonymousClass2.Camera2StreamConfigurationMap = objArr;
                    return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function4 function4) {
                    super(3, continuation);
                    this.getHighSpeedVideoFpsRanges = function4;
                }
            }
        };
    }

    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlinx.coroutines.flow.Flow<? extends T3> flow3, kotlin.jvm.functions.Function5<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function5) {
        return kotlinx.coroutines.flow.FlowKt.flow(new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new kotlinx.coroutines.flow.Flow[]{flow, flow2, flow3}, null, function5));
    }

    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlinx.coroutines.flow.Flow<? extends T3> flow3, kotlinx.coroutines.flow.Flow<? extends T4> flow4, final kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function5) {
        final kotlinx.coroutines.flow.Flow[] flowArr = {flow, flow2, flow3, flow4};
        return new kotlinx.coroutines.flow.Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                kotlin.jvm.functions.Function0 function0;
                kotlinx.coroutines.flow.Flow[] flowArr2 = flowArr;
                function0 = new kotlin.jvm.functions.Function0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Void invoke() {
                        return null;
                    }
                };
                java.lang.Object combineInternal = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr2, function0, new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2(null, function5), continuation);
                return combineInternal == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, java.lang.Object[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int Camera2StreamConfigurationMap;
                private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlin.jvm.functions.Function5 getHighSpeedVideoSizes;

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
                
                    if (r1.emit(r12, r11) == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
                
                    if (r12 != r0) goto L12;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.Camera2StreamConfigurationMap;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.functions.Function5 function5 = this.getHighSpeedVideoSizes;
                        java.lang.Object obj2 = objArr[0];
                        java.lang.Object obj3 = objArr[1];
                        java.lang.Object obj4 = objArr[2];
                        java.lang.Object obj5 = objArr[3];
                        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                        this.Camera2StreamConfigurationMap = 1;
                        obj = function5.invoke(obj2, obj3, obj4, obj5, this);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.Camera2StreamConfigurationMap = 2;
                }

                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2 anonymousClass2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2(continuation, this.getHighSpeedVideoSizes);
                    anonymousClass2.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    anonymousClass2.getHighSpeedVideoFpsRangesFor = objArr;
                    return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function5 function5) {
                    super(3, continuation);
                    this.getHighSpeedVideoSizes = function5;
                }
            }
        };
    }

    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlinx.coroutines.flow.Flow<? extends T3> flow3, kotlinx.coroutines.flow.Flow<? extends T4> flow4, kotlin.jvm.functions.Function6<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function6) {
        return kotlinx.coroutines.flow.FlowKt.flow(new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new kotlinx.coroutines.flow.Flow[]{flow, flow2, flow3, flow4}, null, function6));
    }

    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlinx.coroutines.flow.Flow<? extends T3> flow3, kotlinx.coroutines.flow.Flow<? extends T4> flow4, kotlinx.coroutines.flow.Flow<? extends T5> flow5, final kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function6) {
        final kotlinx.coroutines.flow.Flow[] flowArr = {flow, flow2, flow3, flow4, flow5};
        return new kotlinx.coroutines.flow.Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                kotlin.jvm.functions.Function0 function0;
                kotlinx.coroutines.flow.Flow[] flowArr2 = flowArr;
                function0 = new kotlin.jvm.functions.Function0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Void invoke() {
                        return null;
                    }
                };
                java.lang.Object combineInternal = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr2, function0, new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3.AnonymousClass2(null, function6), continuation);
                return combineInternal == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, java.lang.Object[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int Camera2StreamConfigurationMap;
                /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlin.jvm.functions.Function6 getHighSpeedVideoSizes;

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
                
                    if (r1.emit(r13, r12) == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
                
                    if (r13 != r0) goto L12;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.Camera2StreamConfigurationMap;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.functions.Function6 function6 = this.getHighSpeedVideoSizes;
                        java.lang.Object obj2 = objArr[0];
                        java.lang.Object obj3 = objArr[1];
                        java.lang.Object obj4 = objArr[2];
                        java.lang.Object obj5 = objArr[3];
                        java.lang.Object obj6 = objArr[4];
                        this.getHighSpeedVideoFpsRangesFor = flowCollector;
                        this.Camera2StreamConfigurationMap = 1;
                        obj = function6.invoke(obj2, obj3, obj4, obj5, obj6, this);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.Camera2StreamConfigurationMap = 2;
                }

                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3.AnonymousClass2 anonymousClass2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3.AnonymousClass2(continuation, this.getHighSpeedVideoSizes);
                    anonymousClass2.getHighSpeedVideoFpsRangesFor = flowCollector;
                    anonymousClass2.getHighSpeedVideoFpsRanges = objArr;
                    return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function6 function6) {
                    super(3, continuation);
                    this.getHighSpeedVideoSizes = function6;
                }
            }
        };
    }

    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlinx.coroutines.flow.Flow<? extends T3> flow3, kotlinx.coroutines.flow.Flow<? extends T4> flow4, kotlinx.coroutines.flow.Flow<? extends T5> flow5, kotlin.jvm.functions.Function7<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function7) {
        return kotlinx.coroutines.flow.FlowKt.flow(new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new kotlinx.coroutines.flow.Flow[]{flow, flow2, flow3, flow4, flow5}, null, function7));
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlinx.coroutines.flow.FlowKt.flow(new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6(flowArr, function3, null));
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combine(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> iterable, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.flow.Flow[] flowArr = (kotlinx.coroutines.flow.Flow[]) kotlin.collections.CollectionsKt.toList(iterable).toArray(new kotlinx.coroutines.flow.Flow[0]);
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(flowArr, function2);
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineTransform(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> iterable, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        kotlinx.coroutines.flow.Flow[] flowArr = (kotlinx.coroutines.flow.Flow[]) kotlin.collections.CollectionsKt.toList(iterable).toArray(new kotlinx.coroutines.flow.Flow[0]);
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlinx.coroutines.flow.FlowKt.flow(new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7(flowArr, function3, null));
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> zip(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.flow.internal.CombineKt.zipImpl(flow, flow2, function3);
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> flowCombine(final kotlinx.coroutines.flow.Flow<? extends T1> flow, final kotlinx.coroutines.flow.Flow<? extends T2> flow2, final kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return new kotlinx.coroutines.flow.Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlin.jvm.functions.Function0 function0;
                kotlinx.coroutines.flow.Flow[] flowArr = {kotlinx.coroutines.flow.Flow.this, flow2};
                function0 = new kotlin.jvm.functions.Function0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Void invoke() {
                        return null;
                    }
                };
                java.lang.Object combineInternal = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr, function0, new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1(function3, null), continuation);
                return combineInternal == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(flowArr, function2);
    }
}
