package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes4.dex */
public final class wb {

    /* renamed from: a, reason: collision with root package name */
    public final w7 f5057a;
    public final long b;

    public static final class a extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public int f;
        public final /* synthetic */ Context h;
        public final /* synthetic */ List i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, Continuation continuation) {
            super(2, continuation);
            this.h = context;
            this.i = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return wb.this.new a(this.h, this.i, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00ed A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x001f, B:7:0x00b4, B:9:0x00bc, B:19:0x00ed, B:20:0x004f, B:22:0x0055, B:25:0x011b), top: B:5:0x001f }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x001f, B:7:0x00b4, B:9:0x00bc, B:19:0x00ed, B:20:0x004f, B:22:0x0055, B:25:0x011b), top: B:5:0x001f }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x011b A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x001f, B:7:0x00b4, B:9:0x00bc, B:19:0x00ed, B:20:0x004f, B:22:0x0055, B:25:0x011b), top: B:5:0x001f }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00bc A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x001f, B:7:0x00b4, B:9:0x00bc, B:19:0x00ed, B:20:0x004f, B:22:0x0055, B:25:0x011b), top: B:5:0x001f }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b1 -> B:7:0x00b4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            ExoPlayer exoPlayer;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f;
            ExoPlayer exoPlayer2 = null;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    ExoPlayer a2 = wb.this.f5057a.a(this.h);
                    i = 0;
                    try {
                        a2.setPlayWhenReady(false);
                        a2.setVolume(0.0f);
                        exoPlayer = a2;
                        it = this.i.iterator();
                        if (it.hasNext()) {
                        }
                    } catch (Throwable th) {
                        exoPlayer2 = a2;
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.e;
                ub ubVar = (ub) this.d;
                it = (Iterator) this.c;
                exoPlayer = (ExoPlayer) this.b;
                try {
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        mb.a("Candidate accepted: " + ubVar.c() + " at " + ubVar.d(), (Throwable) null, 2, (Object) null);
                        if (exoPlayer != null) {
                            try {
                                exoPlayer.release();
                                return ubVar;
                            } catch (Exception e) {
                                mb.e("Failed to release probe player", e);
                            }
                        }
                        return ubVar;
                    }
                    mb.a("Candidate rejected: " + ubVar.c() + " at " + ubVar.d(), (Throwable) null, 2, (Object) null);
                    exoPlayer.stop();
                    exoPlayer.clearMediaItems();
                    if (it.hasNext()) {
                        mb.e("All " + this.i.size() + " candidates failed probing", null, 2, null);
                        try {
                            exoPlayer.release();
                            return null;
                        } catch (Exception e2) {
                            mb.e("Failed to release probe player", e2);
                            return null;
                        }
                    }
                    i++;
                    ubVar = (ub) it.next();
                    mb.a("Probing candidate " + i + "/" + this.i.size() + ": " + ubVar.c() + " at " + ubVar.d(), (Throwable) null, 2, (Object) null);
                    wb wbVar = wb.this;
                    String d = ubVar.d();
                    this.b = exoPlayer;
                    this.c = it;
                    this.d = ubVar;
                    this.e = i;
                    this.f = 1;
                    obj = wbVar.a(exoPlayer, d, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    exoPlayer2 = exoPlayer;
                }
            }
            if (exoPlayer2 != null) {
                try {
                    exoPlayer2.release();
                } catch (Exception e3) {
                    mb.e("Failed to release probe player", e3);
                }
            }
            throw th;
        }
    }

    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return wb.this.a((ExoPlayer) null, (String) null, this);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ ExoPlayer e;
        public final /* synthetic */ String f;

        public static final class a implements Player.Listener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f5058a;
            public final /* synthetic */ ExoPlayer b;
            public final /* synthetic */ CancellableContinuation c;

            public a(String str, ExoPlayer exoPlayer, CancellableContinuation cancellableContinuation) {
                this.f5058a = str;
                this.b = exoPlayer;
                this.c = cancellableContinuation;
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int i) {
                if (i == 3) {
                    this.b.removeListener(this);
                    if (this.c.isActive()) {
                        CancellableContinuation cancellableContinuation = this.c;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m8079constructorimpl(Boolean.TRUE));
                        return;
                    }
                    return;
                }
                if (i != 4) {
                    return;
                }
                this.b.removeListener(this);
                if (this.c.isActive()) {
                    CancellableContinuation cancellableContinuation2 = this.c;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m8079constructorimpl(Boolean.FALSE));
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                mb.a("Probe error for " + this.f5058a + ": code=" + error.errorCode + ", message=" + error.getMessage(), (Throwable) null, 2, (Object) null);
                this.b.removeListener(this);
                if (this.c.isActive()) {
                    CancellableContinuation cancellableContinuation = this.c;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m8079constructorimpl(Boolean.FALSE));
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onTracksChanged(Tracks tracks) {
                Intrinsics.checkNotNullParameter(tracks, "tracks");
                ImmutableList<Tracks.Group> groups = tracks.getGroups();
                Intrinsics.checkNotNullExpressionValue(groups, "getGroups(...)");
                ArrayList arrayList = new ArrayList();
                int size = groups.size();
                int i = 0;
                while (i < size) {
                    Tracks.Group group = groups.get(i);
                    i++;
                    if (group.getType() == 2) {
                        arrayList.add(group);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Tracks.Group group2 = (Tracks.Group) obj;
                    IntRange until = RangesKt.until(0, group2.length);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<Integer> it = until.iterator();
                    while (it.hasNext()) {
                        String str = group2.getTrackFormat(((IntIterator) it).nextInt()).sampleMimeType;
                        if (str != null) {
                            arrayList3.add(str);
                        }
                    }
                    CollectionsKt.addAll(arrayList2, arrayList3);
                }
                String a2 = i6.a(arrayList2);
                if (a2 != null) {
                    mb.a("Candidate rejected at onTracksChanged: no decoder for " + a2 + " at " + this.f5058a, (Throwable) null, 2, (Object) null);
                    this.b.removeListener(this);
                    if (this.c.isActive()) {
                        CancellableContinuation cancellableContinuation = this.c;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m8079constructorimpl(Boolean.FALSE));
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExoPlayer exoPlayer, String str, Continuation continuation) {
            super(2, continuation);
            this.e = exoPlayer;
            this.f = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ExoPlayer exoPlayer = this.e;
            String str = this.f;
            this.b = exoPlayer;
            this.c = str;
            this.d = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            exoPlayer.addListener(new a(str, exoPlayer, cancellableContinuationImpl));
            exoPlayer.setMediaItem(MediaItem.fromUri(str));
            exoPlayer.prepare();
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }
    }

    public wb(w7 exoPlayerFactory, long j) {
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        this.f5057a = exoPlayerFactory;
        this.b = j;
    }

    public final Object a(Context context, List list, Continuation continuation) {
        if (list.isEmpty()) {
            return null;
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new a(context, list, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ExoPlayer exoPlayer, String str, Continuation continuation) {
        b bVar;
        int i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    c cVar = new c(exoPlayer, str, null);
                    bVar.d = 1;
                    obj = TimeoutKt.withTimeoutOrNull(j, cVar, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boxing.boxBoolean(bool == null ? bool.booleanValue() : false);
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }
}
