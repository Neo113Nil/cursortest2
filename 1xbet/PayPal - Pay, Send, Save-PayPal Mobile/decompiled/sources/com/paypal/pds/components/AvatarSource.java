package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019BI\b\u0004\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR<\u0010\u000f\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0003\u001a\u001b\u001c"}, d2 = {"Lcom/paypal/pds/components/AvatarSource;", "", "Lkotlin/Function3;", "Landroidx/compose/foundation/layout/BoxScope;", "Lcom/paypal/pds/components/AvatarSize;", "Lcom/paypal/pds/components/AvatarEmphasis;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/Function1;", "Lcom/paypal/pds/core/Color;", "p1", "<init>", "(Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function1;)V", "content", "Lkotlin/jvm/functions/Function5;", "getContent$pds_release", "()Lkotlin/jvm/functions/Function5;", "backgroundColor", "Lkotlin/jvm/functions/Function1;", "getBackgroundColor$pds_release", "()Lkotlin/jvm/functions/Function1;", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "Icon", "Initials", "Lcom/paypal/pds/components/AvatarSource$Icon;", "Lcom/paypal/pds/components/AvatarSource$Image;", "Lcom/paypal/pds/components/AvatarSource$Initials;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AvatarSource {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<com.paypal.pds.components.AvatarEmphasis, com.paypal.pds.core.Color> backgroundColor;
    private final kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, com.paypal.pds.components.AvatarSize, com.paypal.pds.components.AvatarEmphasis, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;

    /* JADX WARN: Multi-variable type inference failed */
    private AvatarSource(kotlin.jvm.functions.Function5<? super androidx.compose.foundation.layout.BoxScope, ? super com.paypal.pds.components.AvatarSize, ? super com.paypal.pds.components.AvatarEmphasis, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, kotlin.jvm.functions.Function1<? super com.paypal.pds.components.AvatarEmphasis, ? extends com.paypal.pds.core.Color> function1) {
        this.content = function5;
        this.backgroundColor = function1;
    }

    public final kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, com.paypal.pds.components.AvatarSize, com.paypal.pds.components.AvatarEmphasis, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent$pds_release() {
        return this.content;
    }

    public /* synthetic */ AvatarSource(kotlin.jvm.functions.Function5 function5, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function5, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.AvatarSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.components.AvatarSource.$r8$lambda$3TxxDDcNF5_CRILTsN3gOEuWuyk((com.paypal.pds.components.AvatarEmphasis) obj);
            }
        } : function1, null);
    }

    public final kotlin.jvm.functions.Function1<com.paypal.pds.components.AvatarEmphasis, com.paypal.pds.core.Color> getBackgroundColor$pds_release() {
        return this.backgroundColor;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/AvatarSource$Image;", "Lcom/paypal/pds/components/AvatarSource;", "Landroidx/compose/ui/graphics/painter/Painter;", "image", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Image extends com.paypal.pds.components.AvatarSource {
        public static final int $stable = 0;

        public /* synthetic */ Image(androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.layout.ContentScale contentScale, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(painter, (i & 2) != 0 ? androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop() : contentScale);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(final androidx.compose.ui.graphics.painter.Painter painter, final androidx.compose.ui.layout.ContentScale contentScale) {
            super(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1936581180, true, new kotlin.jvm.functions.Function5() { // from class: com.paypal.pds.components.AvatarSource$Image$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function5
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return com.paypal.pds.components.AvatarSource.Image.$r8$lambda$lEtgk5lxeqTqqZ37BGsi2X00QWo(androidx.compose.ui.graphics.painter.Painter.this, contentScale, (androidx.compose.foundation.layout.BoxScope) obj, (com.paypal.pds.components.AvatarSize) obj2, (com.paypal.pds.components.AvatarEmphasis) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                }
            }), new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.AvatarSource$Image$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.components.AvatarSource.Image.m21585$r8$lambda$m3crhZfA6J7uXfaM84Z1umTCbI((com.paypal.pds.components.AvatarEmphasis) obj);
                }
            }, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentScale, "");
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$lEtgk5lxeqTqqZ37BGsi2X00QWo(androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.foundation.layout.BoxScope boxScope, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, androidx.compose.runtime.Composer composer, int i) {
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarSize, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarEmphasis, "");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(boxScope) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (composer.shouldExecute((i2 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3) != 1026, i2 & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1936581180, i2, -1, "com.paypal.pds.components.AvatarSource.Image.<init>.<anonymous> (Avatar.kt:142)");
                }
                com.paypal.pds.components.ImageKt.Image(painter, "", com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(boxScope.matchParentSize(androidx.compose.ui.Modifier.INSTANCE), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderMuted.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShapeFull(), composer, 3504, 0), contentScale, null, null, null, composer, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 112);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: $r8$lambda$m3crhZfA6J7uXfaM84Z1um-TCbI, reason: not valid java name */
        public static /* synthetic */ com.paypal.pds.core.Color m21585$r8$lambda$m3crhZfA6J7uXfaM84Z1umTCbI(com.paypal.pds.components.AvatarEmphasis avatarEmphasis) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarEmphasis, "");
            return !(avatarEmphasis instanceof com.paypal.pds.components.AvatarEmphasis.Custom) ? com.paypal.pds.core.Color.BackgroundUtilityImagePlaceholder.INSTANCE : avatarEmphasis.getBackgroundColor();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/pds/components/AvatarSource$Icon;", "Lcom/paypal/pds/components/AvatarSource;", "Lcom/paypal/pds/core/Icon;", "icon", "<init>", "(Lcom/paypal/pds/core/Icon;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Icon extends com.paypal.pds.components.AvatarSource {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Icon(final com.paypal.pds.core.Icon icon) {
            super(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(590294618, true, new kotlin.jvm.functions.Function5() { // from class: com.paypal.pds.components.AvatarSource$Icon$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function5
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return com.paypal.pds.components.AvatarSource.Icon.m21584$r8$lambda$_GhylKL1ETOAV106tUK4QsWmE(com.paypal.pds.core.Icon.this, (androidx.compose.foundation.layout.BoxScope) obj, (com.paypal.pds.components.AvatarSize) obj2, (com.paypal.pds.components.AvatarEmphasis) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                }
            }), null, 2, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        }

        /* renamed from: $r8$lambda$_Gh-ylKL1ETOA-V106tUK4QsWmE, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m21584$r8$lambda$_GhylKL1ETOAV106tUK4QsWmE(com.paypal.pds.core.Icon icon, androidx.compose.foundation.layout.BoxScope boxScope, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, androidx.compose.runtime.Composer composer, int i) {
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarSize, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarEmphasis, "");
            if ((i & 48) == 0) {
                i2 = (composer.changed(avatarSize) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(avatarEmphasis) ? 256 : 128;
            }
            if (composer.shouldExecute((i2 & 1169) != 1168, i2 & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(590294618, i2, -1, "com.paypal.pds.components.AvatarSource.Icon.<init>.<anonymous> (Avatar.kt:170)");
                }
                com.paypal.pds.components.IconKt.Icon(icon, null, null, avatarSize.getIconSize(), avatarEmphasis.getContentColor(), composer, 48, 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/pds/components/AvatarSource$Initials;", "Lcom/paypal/pds/components/AvatarSource;", "", "text", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Initials extends com.paypal.pds.components.AvatarSource {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Initials(final java.lang.String str) {
            super(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-530541680, true, new kotlin.jvm.functions.Function5() { // from class: com.paypal.pds.components.AvatarSource$Initials$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function5
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return com.paypal.pds.components.AvatarSource.Initials.$r8$lambda$FFdF4TolSNFVd_Md6B7JXqm3jWs(str, (androidx.compose.foundation.layout.BoxScope) obj, (com.paypal.pds.components.AvatarSize) obj2, (com.paypal.pds.components.AvatarEmphasis) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                }
            }), null, 2, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$FFdF4TolSNFVd_Md6B7JXqm3jWs(java.lang.String str, androidx.compose.foundation.layout.BoxScope boxScope, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, androidx.compose.runtime.Composer composer, int i) {
            int i2;
            java.lang.String str2 = str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarSize, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarEmphasis, "");
            if ((i & 48) == 0) {
                i2 = (composer.changed(avatarSize) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(avatarEmphasis) ? 256 : 128;
            }
            if (composer.shouldExecute((i2 & 1169) != 1168, i2 & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-530541680, i2, -1, "com.paypal.pds.components.AvatarSource.Initials.<init>.<anonymous> (Avatar.kt:185)");
                }
                boolean changed = composer.changed(str2);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    if (str.length() > 2) {
                        str2 = kotlin.text.StringsKt.take(str2, 2);
                    }
                    rememberedValue = str2.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rememberedValue, "");
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.LabelKt.m21915Labelb76ZbDY((java.lang.String) rememberedValue, null, avatarEmphasis.getContentColor(), 0L, null, null, null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, null, false, 0, 0, true, null, avatarSize.getTypography(), composer, 0, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 97786);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ com.paypal.pds.core.Color $r8$lambda$3TxxDDcNF5_CRILTsN3gOEuWuyk(com.paypal.pds.components.AvatarEmphasis avatarEmphasis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarEmphasis, "");
        return avatarEmphasis.getBackgroundColor();
    }

    public /* synthetic */ AvatarSource(kotlin.jvm.functions.Function5 function5, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function5, function1);
    }
}
