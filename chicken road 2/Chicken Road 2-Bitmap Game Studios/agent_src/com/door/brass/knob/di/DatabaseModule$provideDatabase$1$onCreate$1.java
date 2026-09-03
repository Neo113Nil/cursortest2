package com.door.brass.knob.di;

import com.door.brass.knob.data.db.AppDatabase;
import com.door.brass.knob.data.db.DatabaseSeeder;
import defpackage.yzPsTade5rL7D3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.di.DatabaseModule$provideDatabase$1$onCreate$1", f = "DatabaseModule.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DatabaseModule$provideDatabase$1$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef FsuUJlzzWhYnMlD;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseModule$provideDatabase$1$onCreate$1(Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.Uo5pffGf8LUU;
        if (i == 0) {
            ResultKt.hRNgd2zGCE5kj(obj);
            Object obj2 = this.FsuUJlzzWhYnMlD.oyjLVtGms9eZwJ0;
            if (obj2 == null) {
                Intrinsics.gmXBnHsR2YSm("instance");
                throw null;
            }
            this.Uo5pffGf8LUU = 1;
            if (DatabaseSeeder.yzPsTade5rL7D3.yzPsTade5rL7D3((AppDatabase) obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.hRNgd2zGCE5kj(obj);
        }
        return Unit.yzPsTade5rL7D3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new DatabaseModule$provideDatabase$1$onCreate$1(this.FsuUJlzzWhYnMlD, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((DatabaseModule$provideDatabase$1$onCreate$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
