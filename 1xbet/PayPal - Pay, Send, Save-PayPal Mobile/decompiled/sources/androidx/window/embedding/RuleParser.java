package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u00020\u000f*\u0012\u0012\u0004\u0012\u00020\t0\fj\b\u0012\u0004\u0012\u00020\t`\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/window/embedding/RuleParser;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "", "Landroidx/window/embedding/EmbeddingRule;", "parseRules$window_release", "(Landroid/content/Context;I)Ljava/util/Set;", "Ljava/util/HashSet;", "Lkotlin/collections/getHighSpeedVideoSizesFor;", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/HashSet;Landroidx/window/embedding/EmbeddingRule;)V", "", "", "p1", "Landroid/content/ComponentName;", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/ComponentName;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RuleParser {
    public static final androidx.window.embedding.RuleParser INSTANCE = new androidx.window.embedding.RuleParser();

    private RuleParser() {
    }

    public final java.util.Set<androidx.window.embedding.EmbeddingRule> parseRules$window_release(android.content.Context context, int staticRuleResourceId) {
        java.lang.String str;
        android.content.res.XmlResourceParser xmlResourceParser;
        java.util.HashSet hashSet;
        int i;
        androidx.window.embedding.SplitPlaceholderRule build;
        androidx.window.embedding.SplitPairRule build2;
        androidx.window.embedding.ActivityRule plus$window_release;
        java.util.HashSet hashSet2;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(staticRuleResourceId);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(xml, "");
            java.util.HashSet hashSet3 = new java.util.HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            androidx.window.embedding.SplitPairRule splitPairRule = null;
            androidx.window.embedding.ActivityRule activityRule = null;
            androidx.window.embedding.SplitPlaceholderRule splitPlaceholderRule = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || kotlin.jvm.internal.Intrinsics.areEqual("split-config", xml.getName())) {
                    str = str2;
                    xmlResourceParser = xml;
                    hashSet = hashSet3;
                    i = depth;
                    next = xmlResourceParser.next();
                } else {
                    java.lang.String name2 = xml.getName();
                    if (name2 != null) {
                        switch (name2.hashCode()) {
                            case 304713008:
                                str = str2;
                                xmlResourceParser = xml;
                                hashSet = hashSet3;
                                i = depth;
                                if (name2.equals("DividerAttributes")) {
                                    if (splitPairRule == null && splitPlaceholderRule == null) {
                                        throw new java.lang.IllegalArgumentException("Found orphaned DividerAttributes");
                                    }
                                    android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, androidx.window.R.styleable.DividerAttributes, 0, 0);
                                    int i2 = obtainStyledAttributes.getInt(androidx.window.R.styleable.DividerAttributes_embeddingDividerType, 0);
                                    androidx.window.embedding.DividerAttributes.INSTANCE.validateXmlDividerAttributes$window_release(i2, obtainStyledAttributes.hasValue(androidx.window.R.styleable.DividerAttributes_dragRangeMinRatio), obtainStyledAttributes.hasValue(androidx.window.R.styleable.DividerAttributes_dragRangeMaxRatio), obtainStyledAttributes.hasValue(androidx.window.R.styleable.DividerAttributes_isDraggingToFullscreenAllowed));
                                    androidx.window.embedding.DividerAttributes createDividerAttributes$window_release = androidx.window.embedding.DividerAttributes.INSTANCE.createDividerAttributes$window_release(i2, obtainStyledAttributes.getInt(androidx.window.R.styleable.DividerAttributes_embeddingDividerWidthDp, -1), obtainStyledAttributes.getColor(androidx.window.R.styleable.DividerAttributes_embeddingDividerColor, -16777216), obtainStyledAttributes.getFloat(androidx.window.R.styleable.DividerAttributes_dragRangeMinRatio, -1.0f), obtainStyledAttributes.getFloat(androidx.window.R.styleable.DividerAttributes_dragRangeMaxRatio, -1.0f), obtainStyledAttributes.getBoolean(androidx.window.R.styleable.DividerAttributes_isDraggingToFullscreenAllowed, false));
                                    if (splitPairRule != null) {
                                        hashSet.remove(splitPairRule);
                                        build2 = new androidx.window.embedding.SplitPairRule.Builder(splitPairRule).setDefaultSplitAttributes(new androidx.window.embedding.SplitAttributes.Builder(splitPairRule.getDefaultSplitAttributes()).setDividerAttributes(createDividerAttributes$window_release).build()).build();
                                        getHighSpeedVideoFpsRanges(hashSet, build2);
                                        splitPairRule = build2;
                                    } else if (splitPlaceholderRule != null) {
                                        hashSet.remove(splitPlaceholderRule);
                                        build = new androidx.window.embedding.SplitPlaceholderRule.Builder(splitPlaceholderRule).setDefaultSplitAttributes(new androidx.window.embedding.SplitAttributes.Builder(splitPlaceholderRule.getDefaultSplitAttributes()).setDividerAttributes(createDividerAttributes$window_release).build()).build();
                                        getHighSpeedVideoFpsRanges(hashSet, build);
                                        splitPlaceholderRule = build;
                                    }
                                }
                                next = xmlResourceParser.next();
                                break;
                            case 511422343:
                                str = str2;
                                xmlResourceParser = xml;
                                hashSet = hashSet3;
                                i = depth;
                                if (name2.equals("ActivityFilter")) {
                                    if (activityRule == null && splitPlaceholderRule == null) {
                                        throw new java.lang.IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                    android.content.res.TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(xmlResourceParser, androidx.window.R.styleable.ActivityFilter, 0, 0);
                                    java.lang.String string = obtainStyledAttributes2.getString(androidx.window.R.styleable.ActivityFilter_activityName);
                                    java.lang.String string2 = obtainStyledAttributes2.getString(androidx.window.R.styleable.ActivityFilter_activityAction);
                                    java.lang.String packageName = context.getApplicationContext().getPackageName();
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(packageName);
                                    androidx.window.embedding.ActivityFilter activityFilter = new androidx.window.embedding.ActivityFilter(getHighSpeedVideoSizes(packageName, string), string2);
                                    if (activityRule != null) {
                                        hashSet.remove(activityRule);
                                        plus$window_release = activityRule.plus$window_release(activityFilter);
                                        getHighSpeedVideoFpsRanges(hashSet, plus$window_release);
                                        activityRule = plus$window_release;
                                    } else if (splitPlaceholderRule != null) {
                                        hashSet.remove(splitPlaceholderRule);
                                        build = splitPlaceholderRule.plus$window_release(activityFilter);
                                        getHighSpeedVideoFpsRanges(hashSet, build);
                                        splitPlaceholderRule = build;
                                    }
                                }
                                next = xmlResourceParser.next();
                                break;
                            case 520447504:
                                xmlResourceParser = xml;
                                hashSet2 = hashSet3;
                                i = depth;
                                if (name2.equals("SplitPairRule")) {
                                    android.content.res.TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(xmlResourceParser, androidx.window.R.styleable.SplitPairRule, 0, 0);
                                    java.lang.String string3 = obtainStyledAttributes3.getString(androidx.window.R.styleable.SplitPairRule_tag);
                                    float f = obtainStyledAttributes3.getFloat(androidx.window.R.styleable.SplitPairRule_splitRatio, 0.5f);
                                    int integer = obtainStyledAttributes3.getInteger(androidx.window.R.styleable.SplitPairRule_splitMinWidthDp, 600);
                                    int integer2 = obtainStyledAttributes3.getInteger(androidx.window.R.styleable.SplitPairRule_splitMinHeightDp, 600);
                                    int integer3 = obtainStyledAttributes3.getInteger(androidx.window.R.styleable.SplitPairRule_splitMinSmallestWidthDp, 600);
                                    float f2 = obtainStyledAttributes3.getFloat(androidx.window.R.styleable.SplitPairRule_splitMaxAspectRatioInPortrait, androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT.getValue());
                                    float f3 = obtainStyledAttributes3.getFloat(androidx.window.R.styleable.SplitPairRule_splitMaxAspectRatioInLandscape, androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT.getValue());
                                    int i3 = obtainStyledAttributes3.getInt(androidx.window.R.styleable.SplitPairRule_splitLayoutDirection, androidx.window.embedding.SplitAttributes.LayoutDirection.LOCALE.getValue());
                                    int i4 = obtainStyledAttributes3.getInt(androidx.window.R.styleable.SplitPairRule_finishPrimaryWithSecondary, androidx.window.embedding.SplitRule.FinishBehavior.NEVER.getValue());
                                    int i5 = obtainStyledAttributes3.getInt(androidx.window.R.styleable.SplitPairRule_finishSecondaryWithPrimary, androidx.window.embedding.SplitRule.FinishBehavior.ALWAYS.getValue());
                                    boolean z = obtainStyledAttributes3.getBoolean(androidx.window.R.styleable.SplitPairRule_clearTop, false);
                                    int color = obtainStyledAttributes3.getColor(androidx.window.R.styleable.SplitPairRule_animationBackgroundColor, 0);
                                    str = str2;
                                    int i6 = obtainStyledAttributes3.getInt(androidx.window.R.styleable.SplitPairRule_splitOpenAnimation, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue());
                                    int i7 = obtainStyledAttributes3.getInt(androidx.window.R.styleable.SplitPairRule_splitCloseAnimation, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue());
                                    int i8 = obtainStyledAttributes3.getInt(androidx.window.R.styleable.SplitPairRule_splitChangeAnimation, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue());
                                    obtainStyledAttributes3.recycle();
                                    build2 = new androidx.window.embedding.SplitPairRule.Builder((java.util.Set<androidx.window.embedding.SplitPairFilter>) kotlin.collections.SetsKt.emptySet()).setTag(string3).setMinWidthDp(integer).setMinHeightDp(integer2).setMinSmallestWidthDp(integer3).setMaxAspectRatioInPortrait(androidx.window.embedding.EmbeddingAspectRatio.INSTANCE.buildAspectRatioFromValue$window_release(f2)).setMaxAspectRatioInLandscape(androidx.window.embedding.EmbeddingAspectRatio.INSTANCE.buildAspectRatioFromValue$window_release(f3)).setFinishPrimaryWithSecondary(androidx.window.embedding.SplitRule.FinishBehavior.INSTANCE.getFinishBehaviorFromValue$window_release(i4)).setFinishSecondaryWithPrimary(androidx.window.embedding.SplitRule.FinishBehavior.INSTANCE.getFinishBehaviorFromValue$window_release(i5)).setClearTop(z).setDefaultSplitAttributes(new androidx.window.embedding.SplitAttributes.Builder().setSplitType(androidx.window.embedding.SplitAttributes.SplitType.INSTANCE.buildSplitTypeFromValue$window_release(f)).setLayoutDirection(androidx.window.embedding.SplitAttributes.LayoutDirection.INSTANCE.getLayoutDirectionFromValue$window_release(i3)).setAnimationParams(new androidx.window.embedding.EmbeddingAnimationParams.Builder().setAnimationBackground(androidx.window.embedding.EmbeddingAnimationBackground.INSTANCE.buildFromValue$window_release(color)).setOpenAnimation(androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.INSTANCE.getAnimationSpecFromValue$window_release(i6)).setCloseAnimation(androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.INSTANCE.getAnimationSpecFromValue$window_release(i7)).setChangeAnimation(androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.INSTANCE.getAnimationSpecFromValue$window_release(i8)).build()).build()).build();
                                    hashSet = hashSet2;
                                    getHighSpeedVideoFpsRanges(hashSet, build2);
                                    activityRule = null;
                                    splitPlaceholderRule = null;
                                    splitPairRule = build2;
                                    next = xmlResourceParser.next();
                                    break;
                                }
                                str = str2;
                                hashSet = hashSet2;
                                next = xmlResourceParser.next();
                            case 1579230604:
                                xmlResourceParser = xml;
                                hashSet2 = hashSet3;
                                i = depth;
                                if (name2.equals("SplitPairFilter")) {
                                    if (splitPairRule == null) {
                                        throw new java.lang.IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    android.content.res.TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(xmlResourceParser, androidx.window.R.styleable.SplitPairFilter, 0, 0);
                                    java.lang.String string4 = obtainStyledAttributes4.getString(androidx.window.R.styleable.SplitPairFilter_primaryActivityName);
                                    java.lang.String string5 = obtainStyledAttributes4.getString(androidx.window.R.styleable.SplitPairFilter_secondaryActivityName);
                                    java.lang.String string6 = obtainStyledAttributes4.getString(androidx.window.R.styleable.SplitPairFilter_secondaryActivityAction);
                                    java.lang.String packageName2 = context.getApplicationContext().getPackageName();
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(packageName2);
                                    androidx.window.embedding.SplitPairFilter splitPairFilter = new androidx.window.embedding.SplitPairFilter(getHighSpeedVideoSizes(packageName2, string4), getHighSpeedVideoSizes(packageName2, string5), string6);
                                    hashSet2.remove(splitPairRule);
                                    build2 = splitPairRule.plus$window_release(splitPairFilter);
                                    getHighSpeedVideoFpsRanges(hashSet2, build2);
                                    str = str2;
                                    hashSet = hashSet2;
                                    splitPairRule = build2;
                                    next = xmlResourceParser.next();
                                    break;
                                }
                                str = str2;
                                hashSet = hashSet2;
                                next = xmlResourceParser.next();
                            case 1793077963:
                                xmlResourceParser = xml;
                                hashSet2 = hashSet3;
                                i = depth;
                                if (name2.equals("ActivityRule")) {
                                    android.content.res.TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(xmlResourceParser, androidx.window.R.styleable.ActivityRule, 0, 0);
                                    java.lang.String string7 = obtainStyledAttributes5.getString(androidx.window.R.styleable.ActivityRule_tag);
                                    boolean z2 = obtainStyledAttributes5.getBoolean(androidx.window.R.styleable.ActivityRule_alwaysExpand, false);
                                    obtainStyledAttributes5.recycle();
                                    androidx.window.embedding.ActivityRule.Builder alwaysExpand = new androidx.window.embedding.ActivityRule.Builder(kotlin.collections.SetsKt.emptySet()).setAlwaysExpand(z2);
                                    if (string7 != null) {
                                        alwaysExpand.setTag(string7);
                                    }
                                    plus$window_release = alwaysExpand.build();
                                    getHighSpeedVideoFpsRanges(hashSet2, plus$window_release);
                                    str = str2;
                                    hashSet = hashSet2;
                                    splitPairRule = null;
                                    splitPlaceholderRule = null;
                                    activityRule = plus$window_release;
                                    next = xmlResourceParser.next();
                                    break;
                                }
                                str = str2;
                                hashSet = hashSet2;
                                next = xmlResourceParser.next();
                            case 2050988213:
                                if (name2.equals("SplitPlaceholderRule")) {
                                    android.content.res.TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(xml, androidx.window.R.styleable.SplitPlaceholderRule, 0, 0);
                                    java.lang.String string8 = obtainStyledAttributes6.getString(androidx.window.R.styleable.SplitPlaceholderRule_tag);
                                    java.lang.String string9 = obtainStyledAttributes6.getString(androidx.window.R.styleable.SplitPlaceholderRule_placeholderActivityName);
                                    boolean z3 = obtainStyledAttributes6.getBoolean(androidx.window.R.styleable.SplitPlaceholderRule_stickyPlaceholder, false);
                                    int i9 = obtainStyledAttributes6.getInt(androidx.window.R.styleable.SplitPlaceholderRule_finishPrimaryWithPlaceholder, androidx.window.embedding.SplitRule.FinishBehavior.ALWAYS.getValue());
                                    if (i9 == androidx.window.embedding.SplitRule.FinishBehavior.NEVER.getValue()) {
                                        throw new java.lang.IllegalArgumentException("Never is not a valid configuration for Placeholder activities. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API");
                                    }
                                    float f4 = obtainStyledAttributes6.getFloat(androidx.window.R.styleable.SplitPlaceholderRule_splitRatio, 0.5f);
                                    int integer4 = obtainStyledAttributes6.getInteger(androidx.window.R.styleable.SplitPlaceholderRule_splitMinWidthDp, 600);
                                    int integer5 = obtainStyledAttributes6.getInteger(androidx.window.R.styleable.SplitPlaceholderRule_splitMinHeightDp, 600);
                                    int integer6 = obtainStyledAttributes6.getInteger(androidx.window.R.styleable.SplitPlaceholderRule_splitMinSmallestWidthDp, 600);
                                    float f5 = obtainStyledAttributes6.getFloat(androidx.window.R.styleable.SplitPlaceholderRule_splitMaxAspectRatioInPortrait, androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT.getValue());
                                    float f6 = obtainStyledAttributes6.getFloat(androidx.window.R.styleable.SplitPlaceholderRule_splitMaxAspectRatioInLandscape, androidx.window.embedding.SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT.getValue());
                                    i = depth;
                                    int i10 = obtainStyledAttributes6.getInt(androidx.window.R.styleable.SplitPlaceholderRule_splitLayoutDirection, androidx.window.embedding.SplitAttributes.LayoutDirection.LOCALE.getValue());
                                    xmlResourceParser = xml;
                                    int color2 = obtainStyledAttributes6.getColor(androidx.window.R.styleable.SplitPlaceholderRule_animationBackgroundColor, 0);
                                    java.util.HashSet hashSet4 = hashSet3;
                                    int i11 = obtainStyledAttributes6.getInt(androidx.window.R.styleable.SplitPlaceholderRule_splitOpenAnimation, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue());
                                    int i12 = obtainStyledAttributes6.getInt(androidx.window.R.styleable.SplitPlaceholderRule_splitCloseAnimation, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue());
                                    int i13 = obtainStyledAttributes6.getInt(androidx.window.R.styleable.SplitPlaceholderRule_splitChangeAnimation, androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue());
                                    obtainStyledAttributes6.recycle();
                                    androidx.window.embedding.SplitAttributes build3 = new androidx.window.embedding.SplitAttributes.Builder().setSplitType(androidx.window.embedding.SplitAttributes.SplitType.INSTANCE.buildSplitTypeFromValue$window_release(f4)).setLayoutDirection(androidx.window.embedding.SplitAttributes.LayoutDirection.INSTANCE.getLayoutDirectionFromValue$window_release(i10)).setAnimationParams(new androidx.window.embedding.EmbeddingAnimationParams.Builder().setAnimationBackground(androidx.window.embedding.EmbeddingAnimationBackground.INSTANCE.buildFromValue$window_release(color2)).setOpenAnimation(androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.INSTANCE.getAnimationSpecFromValue$window_release(i11)).setCloseAnimation(androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.INSTANCE.getAnimationSpecFromValue$window_release(i12)).setChangeAnimation(androidx.window.embedding.EmbeddingAnimationParams.AnimationSpec.INSTANCE.getAnimationSpecFromValue$window_release(i13)).build()).build();
                                    java.lang.String packageName3 = context.getApplicationContext().getPackageName();
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(packageName3);
                                    android.content.ComponentName highSpeedVideoSizes = getHighSpeedVideoSizes(packageName3, string9);
                                    java.util.Set emptySet = kotlin.collections.SetsKt.emptySet();
                                    android.content.Intent component = new android.content.Intent().setComponent(highSpeedVideoSizes);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(component, str2);
                                    build = new androidx.window.embedding.SplitPlaceholderRule.Builder(emptySet, component).setTag(string8).setMinWidthDp(integer4).setMinHeightDp(integer5).setMinSmallestWidthDp(integer6).setMaxAspectRatioInPortrait(androidx.window.embedding.EmbeddingAspectRatio.INSTANCE.buildAspectRatioFromValue$window_release(f5)).setMaxAspectRatioInLandscape(androidx.window.embedding.EmbeddingAspectRatio.INSTANCE.buildAspectRatioFromValue$window_release(f6)).setSticky(z3).setFinishPrimaryWithPlaceholder(androidx.window.embedding.SplitRule.FinishBehavior.INSTANCE.getFinishBehaviorFromValue$window_release(i9)).setDefaultSplitAttributes(build3).build();
                                    getHighSpeedVideoFpsRanges(hashSet4, build);
                                    str = str2;
                                    hashSet = hashSet4;
                                    splitPairRule = null;
                                    activityRule = null;
                                    splitPlaceholderRule = build;
                                    next = xmlResourceParser.next();
                                    break;
                                }
                            default:
                                str = str2;
                                xmlResourceParser = xml;
                                hashSet = hashSet3;
                                i = depth;
                                next = xmlResourceParser.next();
                                break;
                        }
                    }
                    str = str2;
                    xmlResourceParser = xml;
                    hashSet = hashSet3;
                    i = depth;
                    next = xmlResourceParser.next();
                }
                hashSet3 = hashSet;
                xml = xmlResourceParser;
                depth = i;
                str2 = str;
            }
            return hashSet3;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.util.HashSet<androidx.window.embedding.EmbeddingRule> hashSet, androidx.window.embedding.EmbeddingRule embeddingRule) {
        java.lang.String tag = embeddingRule.getTag();
        for (androidx.window.embedding.EmbeddingRule embeddingRule2 : hashSet) {
            if (tag != null && kotlin.jvm.internal.Intrinsics.areEqual(tag, embeddingRule2.getTag())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Duplicated tag: ");
                sb.append(tag);
                sb.append(" for ");
                sb.append(embeddingRule);
                sb.append(". The tag must be unique in XML rule definition.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        hashSet.add(embeddingRule);
    }

    private static android.content.ComponentName getHighSpeedVideoSizes(java.lang.String p0, java.lang.CharSequence p1) {
        if (p1 == null || p1.length() == 0) {
            throw new java.lang.IllegalArgumentException("Activity name must not be null");
        }
        java.lang.String obj = p1.toString();
        if (obj.charAt(0) == '.') {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(p0);
            sb.append(obj);
            return new android.content.ComponentName(p0, sb.toString());
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) obj, kotlinx.io.files.FileSystemKt.UnixPathSeparator, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default > 0) {
            p0 = obj.substring(0, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(p0, "");
            obj = obj.substring(indexOf$default + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, "*") && kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) obj, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, 0, false, 6, (java.lang.Object) null) < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(p0);
            sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb2.append(obj);
            return new android.content.ComponentName(p0, sb2.toString());
        }
        return new android.content.ComponentName(p0, obj);
    }
}
