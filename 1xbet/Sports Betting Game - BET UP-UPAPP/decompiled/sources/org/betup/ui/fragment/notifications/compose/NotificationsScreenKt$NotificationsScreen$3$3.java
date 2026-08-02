package org.betup.ui.fragment.notifications.compose;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.Event;
import org.betup.ui.fragment.notifications.controller.NotificationsController;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: NotificationsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationsScreenKt$NotificationsScreen$3$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ NotificationsController $controller;
    final /* synthetic */ State<String> $error$delegate;
    final /* synthetic */ State<Boolean> $hasMore$delegate;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ State<Boolean> $isLoadingMore$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ State<List<Event>> $notifications$delegate;
    final /* synthetic */ Function1<Event, Unit> $onNotificationClick;

    /* JADX WARN: Multi-variable type inference failed */
    NotificationsScreenKt$NotificationsScreen$3$3(LazyListState lazyListState, State<? extends List<? extends Event>> state, NotificationsController notificationsController, Function1<? super Event, Unit> function1, State<Boolean> state2, State<Boolean> state3, State<Boolean> state4, State<String> state5) {
        this.$listState = lazyListState;
        this.$notifications$delegate = state;
        this.$controller = notificationsController;
        this.$onNotificationClick = function1;
        this.$isLoadingMore$delegate = state2;
        this.$hasMore$delegate = state3;
        this.$isLoading$delegate = state4;
        this.$error$delegate = state5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v12 ??, still in use, count: 1, list:
          (r4v12 ?? I:java.lang.Object) from 0x03a3: INVOKE (r27v0 ?? I:androidx.compose.runtime.Composer), (r4v12 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:582)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v12 ??, still in use, count: 1, list:
          (r4v12 ?? I:java.lang.Object) from 0x03a3: INVOKE (r27v0 ?? I:androidx.compose.runtime.Composer), (r4v12 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:582)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(State state, final NotificationsController notificationsController, final Function1 function1, State state2, State state3, LazyListScope LazyColumn) {
        final List NotificationsScreen$lambda$2;
        boolean NotificationsScreen$lambda$4;
        boolean NotificationsScreen$lambda$5;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        NotificationsScreen$lambda$2 = NotificationsScreenKt.NotificationsScreen$lambda$2(state);
        final NotificationsScreenKt$NotificationsScreen$3$3$invoke$lambda$6$lambda$5$$inlined$items$default$1 notificationsScreenKt$NotificationsScreen$3$3$invoke$lambda$6$lambda$5$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$NotificationsScreen$3$3$invoke$lambda$6$lambda$5$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Event event) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Event) obj);
            }
        };
        LazyColumn.items(NotificationsScreen$lambda$2.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$NotificationsScreen$3$3$invoke$lambda$6$lambda$5$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(NotificationsScreen$lambda$2.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$NotificationsScreen$3$3$invoke$lambda$6$lambda$5$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final Event event = (Event) NotificationsScreen$lambda$2.get(i);
                composer.startReplaceGroup(-1073353603);
                composer.startReplaceGroup(-1746271574);
                boolean changedInstance = composer.changedInstance(event) | composer.changedInstance(notificationsController) | composer.changed(function1);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final NotificationsController notificationsController2 = notificationsController;
                    final Function1 function12 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$NotificationsScreen$3$3$4$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (Event.this.isNew()) {
                                NotificationsController notificationsController3 = notificationsController2;
                                String uid = Event.this.getUid();
                                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                                notificationsController3.markAsRead(uid);
                            }
                            function12.invoke(Event.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                NotificationsScreenKt.NotificationItem(event, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NotificationsScreen$lambda$4 = NotificationsScreenKt.NotificationsScreen$lambda$4(state2);
        if (NotificationsScreen$lambda$4) {
            NotificationsScreen$lambda$5 = NotificationsScreenKt.NotificationsScreen$lambda$5(state3);
            if (NotificationsScreen$lambda$5) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NotificationsScreenKt.INSTANCE.m14076getLambda$2097593268$app_release(), 3, null);
            }
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1699055047, true, new NotificationsScreenKt$NotificationsScreen$3$3$4$1$2(state, state2, notificationsController)), 3, null);
        return Unit.INSTANCE;
    }
}
