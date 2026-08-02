package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\b\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0014\u001ag\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0017\u001aU\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00042(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aE\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004H\u0007¢\u0006\u0004\b \u0010\u001f\u001aP\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00042#\u0010\u0006\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u001b¢\u0006\u0002\b!H\u0007¢\u0006\u0004\b\"\u0010\u001d\u001a-\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%\u001aR\u0010)\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u000421\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0007¢\u0006\u0004\b)\u0010\u0014\u001a{\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u00012F\u0010\u0016\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(+\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130*H\u0007¢\u0006\u0004\b,\u0010-\u001a-\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b.\u0010/\u001aC\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002000\u001bH\u0007¢\u0006\u0004\b.\u00101\u001a-\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b2\u0010/\u001a3\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b2\u0010\f\u001a-\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b3\u0010/\u001a3\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b3\u0010\f\u001ai\u00106\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u00104\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130*H\u0007¢\u0006\u0004\b6\u00107\u001a\u0083\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0000\u00104\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u00108\"\u0004\b\u0003\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042.\u0010:\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001309H\u0007¢\u0006\u0004\b6\u0010;\u001a\u009d\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00040\u0004\"\u0004\b\u0000\u00104\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u00108\"\u0004\b\u0003\u0010<\"\u0004\b\u0004\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00030\u000424\u0010>\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130=H\u0007¢\u0006\u0004\b6\u0010?\u001a·\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00050\u0004\"\u0004\b\u0000\u00104\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u00108\"\u0004\b\u0003\u0010<\"\u0004\b\u0004\u0010@\"\u0004\b\u0005\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042:\u0010B\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130AH\u0007¢\u0006\u0004\b6\u0010C\u001a-\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020DH\u0007¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020DH\u0007¢\u0006\u0004\bG\u0010F\u001ad\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u000427\u0010\u0006\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0007¢\u0006\u0004\bH\u0010\u001a\u001am\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042F\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(+\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130*H\u0007¢\u0006\u0004\bI\u0010J\u001a%\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bK\u0010\u001f\u001a-\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020#H\u0007¢\u0006\u0004\bK\u0010%\u001a%\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bL\u0010\u001f\u001a-\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020#H\u0007¢\u0006\u0004\bL\u0010%\u001a%\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bM\u0010\u001f"}, d2 = {"", "noImpl", "()Ljava/lang/Void;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "p0", "observeOn", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;", "publishOn", "subscribeOn", "onErrorResume", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "onErrorResumeNext", "", "subscribe", "(Lkotlinx/coroutines/flow/Flow;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)V", "", "p1", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "flatMap", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "concatMap", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "merge", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "flatten", "Lkotlin/ExtensionFunctionType;", "compose", "", "skip", "(Lkotlinx/coroutines/flow/Flow;I)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/ParameterName;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "forEach", "Lkotlin/Function3;", "accumulator", "scanFold", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "onErrorReturn", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "startWith", "concatWith", "T1", "T2", "combineLatest", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "T3", "Lkotlin/Function4;", "p2", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "T4", "Lkotlin/Function5;", "p3", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "T5", "Lkotlin/Function6;", "p4", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "", "delayFlow", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "delayEach", "switchMap", "scanReduce", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "publish", "replay", com.datadog.trace.api.DDSpanTypes.CACHE}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__MigrationKt {
    public static /* synthetic */ boolean getHighSpeedVideoSizes() {
        return true;
    }

    public static final java.lang.Void noImpl() {
        throw new java.lang.UnsupportedOperationException("Not implemented, should not be called");
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> kotlinx.coroutines.flow.Flow<T> observeOn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> kotlinx.coroutines.flow.Flow<T> publishOn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    public static final <T> kotlinx.coroutines.flow.Flow<T> subscribeOn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorResume(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.Flow<? extends T> flow2) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorResumeNext(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.Flow<? extends T> flow2) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMap(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> concatMap(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, ? extends kotlinx.coroutines.flow.Flow<? extends R>> function1) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> flatten(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.ReplaceWith(expression = "let(transformer)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> compose(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.flow.Flow<? extends T>, ? extends kotlinx.coroutines.flow.Flow<? extends R>> function1) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.ReplaceWith(expression = "drop(count)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> skip(kotlinx.coroutines.flow.Flow<? extends T> flow, int i) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.ReplaceWith(expression = "collect(action)", imports = {}))
    public static final <T> void forEach(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> scanFold(kotlinx.coroutines.flow.Flow<? extends T> flow, R r, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorReturn(kotlinx.coroutines.flow.Flow<? extends T> flow, T t) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow onErrorReturn$default(kotlinx.coroutines.flow.Flow flow, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.flow.FlowKt__MigrationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(kotlinx.coroutines.flow.FlowKt__MigrationKt.getHighSpeedVideoSizes());
                }
            };
        }
        return kotlinx.coroutines.flow.FlowKt.onErrorReturn(flow, obj, function1);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorReturn(kotlinx.coroutines.flow.Flow<? extends T> flow, T t, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> function1) {
        return kotlinx.coroutines.flow.FlowKt.m24097catch(flow, new kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2(function1, t, null));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> startWith(kotlinx.coroutines.flow.Flow<? extends T> flow, T t) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> startWith(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.Flow<? extends T> flow2) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> concatWith(kotlinx.coroutines.flow.Flow<? extends T> flow, T t) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> concatWith(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.Flow<? extends T> flow2) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combineLatest(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.flow.FlowKt.combine(flow, flow2, function3);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combineLatest(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlinx.coroutines.flow.Flow<? extends T3> flow3, kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function4) {
        return kotlinx.coroutines.flow.FlowKt.combine(flow, flow2, flow3, function4);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combineLatest(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlinx.coroutines.flow.Flow<? extends T3> flow3, kotlinx.coroutines.flow.Flow<? extends T4> flow4, kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function5) {
        return kotlinx.coroutines.flow.FlowKt.combine(flow, flow2, flow3, flow4, function5);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combineLatest(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlinx.coroutines.flow.Flow<? extends T3> flow3, kotlinx.coroutines.flow.Flow<? extends T4> flow4, kotlinx.coroutines.flow.Flow<? extends T5> flow5, kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function6) {
        return kotlinx.coroutines.flow.FlowKt.combine(flow, flow2, flow3, flow4, flow5, function6);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> delayFlow(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.FlowKt.onStart(flow, new kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1(j, null));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> delayEach(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.FlowKt.onEach(flow, new kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1(j, null));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> scanReduce(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.flow.FlowKt.runningReduce(flow, function3);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> publish(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> publish(kotlinx.coroutines.flow.Flow<? extends T> flow, int i) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> replay(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> replay(kotlinx.coroutines.flow.Flow<? extends T> flow, int i) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStarted.Lazily' argument'", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> cache(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> switchMap(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(flow, new kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(function2, null));
    }
}
