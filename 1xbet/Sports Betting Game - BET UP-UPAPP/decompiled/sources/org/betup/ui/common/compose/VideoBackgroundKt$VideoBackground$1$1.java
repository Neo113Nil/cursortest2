package org.betup.ui.common.compose;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoBackground.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoBackgroundKt$VideoBackground$1$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ MutableState<Boolean> $useFallback$delegate;
    final /* synthetic */ Uri $videoUri;

    VideoBackgroundKt$VideoBackground$1$1(ContentScale contentScale, MutableState<Boolean> mutableState, Uri uri) {
        this.$contentScale = contentScale;
        this.$useFallback$delegate = mutableState;
        this.$videoUri = uri;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1796987966, i2, -1, "org.betup.ui.common.compose.VideoBackground.<anonymous>.<anonymous> (VideoBackground.kt:54)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        float mo1167toPx0680j_4 = density.mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
        float mo1167toPx0680j_42 = density.mo1167toPx0680j_4(BoxWithConstraints.mo1422getMaxHeightD9Ej5fM());
        float f = 1.0f;
        if (Intrinsics.areEqual(this.$contentScale, ContentScale.INSTANCE.getCrop()) && mo1167toPx0680j_42 > 0.0f) {
            f = Math.max(1.0f, (mo1167toPx0680j_4 / mo1167toPx0680j_42) / 1.7777778f);
        }
        float f2 = f;
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$useFallback$delegate) | composer.changedInstance(this.$videoUri);
        final Uri uri = this.$videoUri;
        final MutableState<Boolean> mutableState = this.$useFallback$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.VideoBackgroundKt$VideoBackground$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    VideoView invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = VideoBackgroundKt$VideoBackground$1$1.invoke$lambda$8$lambda$7(uri, mutableState, (Context) obj);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        Modifier m5329graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m5329graphicsLayerAp8cVGQ$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 126972, null);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.common.compose.VideoBackgroundKt$VideoBackground$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$10$lambda$9;
                    invoke$lambda$10$lambda$9 = VideoBackgroundKt$VideoBackground$1$1.invoke$lambda$10$lambda$9((VideoView) obj);
                    return invoke$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        AndroidView_androidKt.AndroidView(function1, m5329graphicsLayerAp8cVGQ$default, (Function1) rememberedValue2, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoView invoke$lambda$8$lambda$7(Uri uri, final MutableState mutableState, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        final VideoView videoView = new VideoView(ctx);
        videoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: org.betup.ui.common.compose.VideoBackgroundKt$VideoBackground$1$1$$ExternalSyntheticLambda2
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoBackgroundKt$VideoBackground$1$1.invoke$lambda$8$lambda$7$lambda$6$lambda$2(videoView, mediaPlayer);
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: org.betup.ui.common.compose.VideoBackgroundKt$VideoBackground$1$1$$ExternalSyntheticLambda3
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                videoView.start();
            }
        });
        videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: org.betup.ui.common.compose.VideoBackgroundKt$VideoBackground$1$1$$ExternalSyntheticLambda4
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                boolean invoke$lambda$8$lambda$7$lambda$6$lambda$5;
                invoke$lambda$8$lambda$7$lambda$6$lambda$5 = VideoBackgroundKt$VideoBackground$1$1.invoke$lambda$8$lambda$7$lambda$6$lambda$5(videoView, mutableState, mediaPlayer, i, i2);
                return invoke$lambda$8$lambda$7$lambda$6$lambda$5;
            }
        });
        videoView.setVideoURI(uri);
        return videoView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$8$lambda$7$lambda$6$lambda$2(VideoView videoView, MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(0.0f, 0.0f);
        videoView.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$8$lambda$7$lambda$6$lambda$5(VideoView videoView, final MutableState mutableState, MediaPlayer mediaPlayer, int i, int i2) {
        videoView.post(new Runnable() { // from class: org.betup.ui.common.compose.VideoBackgroundKt$VideoBackground$1$1$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                VideoBackgroundKt.access$VideoBackground$lambda$2(MutableState.this, true);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(VideoView videoView) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        if (!videoView.isPlaying()) {
            videoView.start();
        }
        return Unit.INSTANCE;
    }
}
