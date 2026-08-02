package arrow.core.raise.context;

@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aI\u0010\u0003\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002¢\u0006\u0004\b\u0003\u0010\u0006\u001af\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002ø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001at\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u000e*\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002ø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a¥\u0001\u0010\u0015\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00122\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00132'\u0010\t\u001a#\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u0002\u0012\u0004\u0012\u00028\u00020\u0013¢\u0006\u0002\b\u0014H\u0087\bR\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002ø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0085\u0001\u0010\u001b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0017j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0019¢\u0006\u0002\b\u001aH\u0087@R\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001al\u0010\u001b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\u0082\u0002\u0012\n\u0010\b\u0000\u001a\f\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0004\b\u001b\u0010\u001f\u001af\u0010\u001b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010 H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"\u0082\u0002\u0012\n\u0010\b\u0000\u001a\f\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b\u001b\u0010$\u001aZ\u0010\u001b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\u0004\u0018\u00018\u0001H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b\u001b\u0010%\u001a3\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000&H\u0007R\u00060'j\u0002`(j\n\u0010\u0003\u001a\u00060'j\u0002`(¢\u0006\u0004\b\u001b\u0010)\u001au\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020+\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010*\"\u0004\b\u0002\u0010\u0012*\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001d0+H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002¢\u0006\u0004\b,\u0010-\u001ac\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010/\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0.H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002¢\u0006\u0004\b,\u00100\u001ac\u0010,\u001a\b\u0012\u0004\u0012\u00028\u000101\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d01H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002¢\u0006\u0004\b,\u00102\u001ac\u0010,\u001a\b\u0012\u0004\u0012\u00028\u000103\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d03H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002¢\u0006\u0004\b,\u00104\u001ao\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020+\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010*\"\u0004\b\u0002\u0010\u0012*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020 0+H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"¢\u0006\u0004\b5\u00106\u001a]\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010/\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0.H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"¢\u0006\u0004\b5\u00107\u001a]\u00105\u001a\b\u0012\u0004\u0012\u00028\u000101\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 01H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"¢\u0006\u0004\b5\u00108\u001a]\u00105\u001a\b\u0012\u0004\u0012\u00028\u000103\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 03H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"¢\u0006\u0004\b5\u00109\u001ak\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020+\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010*\"\u0004\b\u0002\u0010\u0012*\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020+H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"¢\u0006\u0004\b:\u00106\u001aY\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010/\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010.H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"¢\u0006\u0004\b:\u00107\u001aY\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000101\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\n\u0012\u0006\u0012\u0004\u0018\u00018\u000101H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"¢\u0006\u0004\b:\u00108\u001aY\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000103\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\n\u0012\u0006\u0012\u0004\u0018\u00018\u000103H\u0007R\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"j\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"¢\u0006\u0004\b:\u00109\u001aQ\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+\"\u0004\b\u0000\u0010*\"\u0004\b\u0001\u0010\u0012*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&0+H\u0007R\u00060'j\u0002`(j\n\u0010\u0003\u001a\u00060'j\u0002`(¢\u0006\u0004\b;\u0010<\u001a?\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000/\"\u0004\b\u0000\u0010\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0.H\u0007R\u00060'j\u0002`(j\n\u0010\u0003\u001a\u00060'j\u0002`(¢\u0006\u0004\b;\u0010=\u001a?\u0010;\u001a\b\u0012\u0004\u0012\u00028\u000001\"\u0004\b\u0000\u0010\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&01H\u0007R\u00060'j\u0002`(j\n\u0010\u0003\u001a\u00060'j\u0002`(¢\u0006\u0004\b;\u0010>\u001a?\u0010;\u001a\b\u0012\u0004\u0012\u00028\u000003\"\u0004\b\u0000\u0010\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&03H\u0007R\u00060'j\u0002`(j\n\u0010\u0003\u001a\u00060'j\u0002`(¢\u0006\u0004\b;\u0010?*\u001c\u0010@\u001a\u0004\b\u0000\u0010\u0012\"\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0001*\u001c\u0010A\u001a\u0004\b\u0000\u0010\u0012\"\b\u0012\u0004\u0012\u00028\u00000!2\b\u0012\u0004\u0012\u00028\u00000!*\n\u0010B\"\u00020'2\u00020'\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Error", "Larrow/core/raise/Raise;", "Larrow/core/raise/context/Raise;", "raise", "p0", "", "(Larrow/core/raise/Raise;Ljava/lang/Object;)Ljava/lang/Void;", "", "Lkotlin/Function0;", "p1", "", "ensure", "(Larrow/core/raise/Raise;ZLkotlin/jvm/functions/Function0;)V", "", "B", "ensureNotNull", "(Larrow/core/raise/Raise;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "OtherError", "A", "Lkotlin/Function1;", "Lkotlin/ContextFunctionTypeParams;", "withError", "(Larrow/core/raise/Raise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Larrow/core/raise/Effect;", "Lkotlin/ExtensionFunctionType;", "bind", "(Larrow/core/raise/Raise;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Larrow/core/Either;", "Larrow/core/Either$Right;", "(Larrow/core/raise/Raise;Larrow/core/Either;)Ljava/lang/Object;", "Larrow/core/Option;", "Larrow/core/raise/SingletonRaise;", "Larrow/core/raise/context/SingletonRaise;", "Larrow/core/Some;", "(Larrow/core/raise/SingletonRaise;Larrow/core/Option;)Ljava/lang/Object;", "(Larrow/core/raise/SingletonRaise;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Result;", "Larrow/core/raise/ResultRaise;", "Larrow/core/raise/context/ResultRaise;", "(Larrow/core/raise/ResultRaise;Ljava/lang/Object;)Ljava/lang/Object;", "K", "", "bindAllEither", "(Larrow/core/raise/Raise;Ljava/util/Map;)Ljava/util/Map;", "", "", "(Larrow/core/raise/Raise;Ljava/lang/Iterable;)Ljava/util/List;", "Larrow/core/NonEmptyList;", "(Larrow/core/raise/Raise;Ljava/util/List;)Ljava/util/List;", "Larrow/core/NonEmptySet;", "(Larrow/core/raise/Raise;Ljava/util/Set;)Ljava/util/Set;", "bindAllOption", "(Larrow/core/raise/SingletonRaise;Ljava/util/Map;)Ljava/util/Map;", "(Larrow/core/raise/SingletonRaise;Ljava/lang/Iterable;)Ljava/util/List;", "(Larrow/core/raise/SingletonRaise;Ljava/util/List;)Ljava/util/List;", "(Larrow/core/raise/SingletonRaise;Ljava/util/Set;)Ljava/util/Set;", "bindAllNullable", "bindAllResult", "(Larrow/core/raise/ResultRaise;Ljava/util/Map;)Ljava/util/Map;", "(Larrow/core/raise/ResultRaise;Ljava/lang/Iterable;)Ljava/util/List;", "(Larrow/core/raise/ResultRaise;Ljava/util/List;)Ljava/util/List;", "(Larrow/core/raise/ResultRaise;Ljava/util/Set;)Ljava/util/Set;", "Raise", "SingletonRaise", "ResultRaise"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/raise/context/RaiseContextualKt")
/* loaded from: classes7.dex */
final /* synthetic */ class RaiseContextualKt__RaiseContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public static final <Error> java.lang.Void raise(arrow.core.raise.Raise<? super Error> raise, Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        raise.raise(error);
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.lang.Object bind(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return raise.bind(function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A bind(arrow.core.raise.Raise<? super Error> raise, arrow.core.Either<? extends Error, ? extends A> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        return (A) raise.bind((arrow.core.Either<? extends java.lang.Object, ? extends A>) either);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A bind(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, arrow.core.Option<? extends A> option) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
        return (A) singletonRaise.bind((arrow.core.Option) option);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> A bind(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, A a2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        return (A) singletonRaise.bind((arrow.core.raise.SingletonRaise<? super Error>) a2);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> A bind(arrow.core.raise.ResultRaise resultRaise, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultRaise, "");
        return (A) resultRaise.bind(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public static final <Error, K, A> java.util.Map<K, A> bindAllEither(arrow.core.raise.Raise<? super Error> raise, java.util.Map<K, ? extends arrow.core.Either<? extends Error, ? extends A>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return raise.bindAll((java.util.Map<K, ? extends arrow.core.Either<? extends java.lang.Object, ? extends A>>) map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllEither(arrow.core.raise.Raise<? super Error> raise, java.lang.Iterable<? extends arrow.core.Either<? extends Error, ? extends A>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return raise.bindAll((java.lang.Iterable<? extends arrow.core.Either<? extends java.lang.Object, ? extends A>>) iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllEither(arrow.core.raise.Raise<? super Error> raise, java.util.List<? extends arrow.core.Either<? extends Error, ? extends A>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return raise.mo9685bindAllvcjLgH4(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.Set<A> bindAllEither(arrow.core.raise.Raise<? super Error> raise, java.util.Set<? extends arrow.core.Either<? extends Error, ? extends A>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return raise.mo9684bindAll1TN0_VU(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public static final <Error, K, A> java.util.Map<K, A> bindAllOption(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.Map<K, ? extends arrow.core.Option<? extends A>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return (java.util.Map<K, A>) singletonRaise.bindAllOption(map);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllOption(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.lang.Iterable<? extends arrow.core.Option<? extends A>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return singletonRaise.bindAllOption(iterable);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllOption(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.List<? extends arrow.core.Option<? extends A>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return singletonRaise.bindAllOption((java.util.List) list);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.Set<A> bindAllOption(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.Set<? extends arrow.core.Option<? extends A>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return singletonRaise.bindAllOption((java.util.Set) set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @arrow.core.raise.RaiseDSL
    public static final <Error, K, A> java.util.Map<K, A> bindAllNullable(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.Map<K, ? extends A> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return (java.util.Map<K, A>) singletonRaise.bindAllNullable(map);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllNullable(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.lang.Iterable<? extends A> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return singletonRaise.bindAllNullable(iterable);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.List<A> bindAllNullable(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.List<? extends A> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return singletonRaise.bindAllNullable((java.util.List) list);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, A> java.util.Set<A> bindAllNullable(arrow.core.raise.SingletonRaise<? super Error> singletonRaise, java.util.Set<? extends A> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singletonRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return singletonRaise.bindAllNullable((java.util.Set) set);
    }

    @arrow.core.raise.RaiseDSL
    public static final <K, A> java.util.Map<K, A> bindAllResult(arrow.core.raise.ResultRaise resultRaise, java.util.Map<K, ? extends kotlin.Result<? extends A>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return resultRaise.bindAllResult(map);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> java.util.List<A> bindAllResult(arrow.core.raise.ResultRaise resultRaise, java.lang.Iterable<? extends kotlin.Result<? extends A>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return resultRaise.bindAllResult(iterable);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> java.util.List<A> bindAllResult(arrow.core.raise.ResultRaise resultRaise, java.util.List<? extends kotlin.Result<? extends A>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return resultRaise.bindAllResult((java.util.List) list);
    }

    @arrow.core.raise.RaiseDSL
    public static final <A> java.util.Set<A> bindAllResult(arrow.core.raise.ResultRaise resultRaise, java.util.Set<? extends kotlin.Result<? extends A>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultRaise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return resultRaise.bindAllResult((java.util.Set) set);
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error> void ensure(arrow.core.raise.Raise<? super Error> raise, boolean z, kotlin.jvm.functions.Function0<? extends Error> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            return;
        }
        raise.raise(function0.invoke());
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    @kotlin.IgnorableReturnValue
    public static final <Error, B> B ensureNotNull(arrow.core.raise.Raise<? super Error> raise, B b, kotlin.jvm.functions.Function0<? extends Error> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (b != null) {
            return b;
        }
        raise.raise(function0.invoke());
        throw new kotlin.KotlinNothingValueException();
    }

    @arrow.core.raise.RaiseDSL
    public static final <Error, OtherError, A> A withError(arrow.core.raise.Raise<? super Error> raise, kotlin.jvm.functions.Function1<? super OtherError, ? extends Error> function1, kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super OtherError>, ? extends A> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            return function12.invoke(defaultRaise);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            raise.raise(function1.invoke((java.lang.Object) arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise)));
            throw new kotlin.KotlinNothingValueException();
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
