package com.ingo.sdk.android.ux.feature.customer_service;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/customer_service/CustomerServiceFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomerServiceFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.CustomerSupport;
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        final androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1657753948, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment Camera2StreamConfigurationMap;
                final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                        final com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment customerServiceFragment = this.Camera2StreamConfigurationMap;
                        kotlin.jvm.functions.Function0 function0 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR (r7v4 'function0' kotlin.jvm.functions.Function0) = 
                              (r0v1 'customerServiceFragment' com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment A[DONT_INLINE])
                             A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment):void (m)] call: com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            androidx.compose.runtime.Composer r6 = (androidx.compose.runtime.Composer) r6
                            java.lang.Number r7 = (java.lang.Number) r7
                            int r7 = r7.intValue()
                            r7 = r7 & 11
                            r0 = 2
                            if (r7 != r0) goto L17
                            boolean r7 = r6.getSkipping()
                            if (r7 == 0) goto L17
                            r6.skipToGroupEnd()
                            goto L3f
                        L17:
                            com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0 r7 = new com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0
                            com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment r0 = r5.Camera2StreamConfigurationMap
                            r7.<init>(r0)
                            com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1 r0 = new com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1
                            com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment r1 = r5.Camera2StreamConfigurationMap
                            r0.<init>(r1)
                            com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2 r1 = new com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2
                            com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment r2 = r5.Camera2StreamConfigurationMap
                            r1.<init>(r2)
                            com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda3 r2 = new com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1$1$$ExternalSyntheticLambda3
                            com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment r3 = r5.Camera2StreamConfigurationMap
                            androidx.compose.ui.platform.ComposeView r4 = r5.getHighSpeedVideoFpsRangesFor
                            r2.<init>(r3, r4)
                            com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider r3 = new com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider
                            r3.<init>(r7, r0, r1, r2)
                            int r7 = com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider.$stable
                            r3.View(r6, r7)
                        L3f:
                            kotlin.Unit r6 = kotlin.Unit.INSTANCE
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment customerServiceFragment) {
                        com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration customerServiceConfiguration;
                        com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration emailSupport;
                        java.lang.String email;
                        com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment.access$trackEmailPressed(customerServiceFragment);
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                        if (obj != null) {
                            com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).configurationResponse();
                            java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                            if (obj2 != null) {
                                com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse customerResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj2).customerResponse();
                                java.lang.String email2 = customerResponse != null ? customerResponse.getEmail() : null;
                                java.lang.String firstName = customerResponse != null ? customerResponse.getFirstName() : null;
                                java.lang.String lastName = customerResponse != null ? customerResponse.getLastName() : null;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(firstName);
                                sb.append(" ");
                                sb.append(lastName);
                                java.lang.String obj3 = sb.toString();
                                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                                java.lang.String string = customerServiceFragment.getString(com.ingo.sdk.android.R.string.ingo_customer_service_email_subject_template);
                                java.lang.String str = "";
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{obj3}, 1));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                                kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                                java.lang.String string2 = customerServiceFragment.getString(com.ingo.sdk.android.R.string.ingo_customer_service_email_template);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                                java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{obj3, email2}, 2));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
                                android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
                                intent.setData(android.net.Uri.parse(androidx.core.net.MailTo.MAILTO_SCHEME));
                                java.lang.String[] strArr = new java.lang.String[1];
                                if (configurationResponse != null && (customerServiceConfiguration = configurationResponse.getCustomerServiceConfiguration()) != null && (emailSupport = customerServiceConfiguration.getEmailSupport()) != null && (email = emailSupport.getEmail()) != null) {
                                    str = email;
                                }
                                strArr[0] = str;
                                intent.putExtra("android.intent.extra.EMAIL", strArr);
                                intent.putExtra("android.intent.extra.SUBJECT", format);
                                intent.putExtra("android.intent.extra.TEXT", format2);
                                if (intent.resolveActivity(customerServiceFragment.requireContext().getPackageManager()) != null) {
                                    customerServiceFragment.startActivity(intent);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                        }
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment customerServiceFragment) {
                        com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration customerServiceConfiguration;
                        com.ingo.sdk.kotlin.common.features.configuration.model.ChatConfiguration chatSupport;
                        com.ingo.sdk.kotlin.common.features.configuration.model.ChatLinkConfiguration link;
                        com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment.access$trackChatPressed(customerServiceFragment);
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                        if (obj != null) {
                            com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).configurationResponse();
                            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse((configurationResponse == null || (customerServiceConfiguration = configurationResponse.getCustomerServiceConfiguration()) == null || (chatSupport = customerServiceConfiguration.getChatSupport()) == null || (link = chatSupport.getLink()) == null) ? null : link.getUrl()));
                            if (intent.resolveActivity(customerServiceFragment.requireContext().getPackageManager()) != null) {
                                customerServiceFragment.startActivity(intent);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                    }

                    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment customerServiceFragment) {
                        com.ingo.sdk.kotlin.common.features.configuration.model.CustomerServiceConfiguration customerServiceConfiguration;
                        com.ingo.sdk.kotlin.common.features.configuration.model.PhoneConfiguration phoneSupport;
                        com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment.access$trackPhonePressed(customerServiceFragment);
                        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                        if (obj != null) {
                            com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).configurationResponse();
                            intent.setData(android.net.Uri.parse("tel:".concat(java.lang.String.valueOf((configurationResponse == null || (customerServiceConfiguration = configurationResponse.getCustomerServiceConfiguration()) == null || (phoneSupport = customerServiceConfiguration.getPhoneSupport()) == null) ? null : phoneSupport.getNumber()))));
                            if (intent.resolveActivity(customerServiceFragment.requireContext().getPackageManager()) != null) {
                                customerServiceFragment.startActivity(intent);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment customerServiceFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        customerServiceFragment.trackNavigationPressed();
                        androidx.view.ViewKt.findNavController(composeView).popBackStack();
                        return kotlin.Unit.INSTANCE;
                    }

                    AnonymousClass1(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment customerServiceFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        this.Camera2StreamConfigurationMap = customerServiceFragment;
                        this.getHighSpeedVideoFpsRangesFor = composeView;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
                        if (obj != null) {
                            com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1943843360, true, new com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment$onCreateView$1$1.AnonymousClass1(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment.this, composeView), composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }));
            return composeView;
        }

        public static final /* synthetic */ void access$trackChatPressed(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment customerServiceFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
                defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.CustomerSupport);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.ChatNowPressed, defaultProperties$default);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }

        public static final /* synthetic */ void access$trackEmailPressed(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment customerServiceFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
                defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.CustomerSupport);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.SupportEmailPressed, defaultProperties$default);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }

        public static final /* synthetic */ void access$trackPhonePressed(com.ingo.sdk.android.ux.feature.customer_service.CustomerServiceFragment customerServiceFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
                defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.CustomerSupport);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.SupportPhonePressed, defaultProperties$default);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }
    }
