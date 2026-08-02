package com.ingo.sdk.android.ux.feature.identity_documents_uploaded;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/identity_documents_uploaded/IdentityDocumentsUploadedFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IdentityDocumentsUploadedFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.KYCInProgress;
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-224772700, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment Camera2StreamConfigurationMap;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    java.lang.String string;
                    java.lang.String string2;
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
                        if (obj != null) {
                            com.ingo.sdk.kotlin.ux.IngoSdkTheme theme = ((com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj).getTheme();
                            android.os.Bundle arguments = this.Camera2StreamConfigurationMap.getArguments();
                            java.lang.String str = (arguments == null || (string2 = arguments.getString("title")) == null) ? "" : string2;
                            android.os.Bundle arguments2 = this.Camera2StreamConfigurationMap.getArguments();
                            java.lang.String str2 = (arguments2 == null || (string = arguments2.getString("details")) == null) ? "" : string;
                            int i = com.ingo.sdk.android.R.drawable.ic_success_status_icon;
                            java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
                            if (obj2 == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                            }
                            int parseColor = android.graphics.Color.parseColor((com.ingo.sdk.android.core.ux.theme.ThemeKt.isNightMode((androidx.appcompat.app.AppCompatDelegate) obj2, composer2, 8) ? theme.getDark() : theme.getLight()).getSecondaryColor());
                            java.lang.String string3 = this.Camera2StreamConfigurationMap.getString(com.ingo.sdk.android.R.string.ingo_done);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                            final com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment identityDocumentsUploadedFragment = this.Camera2StreamConfigurationMap;
                            kotlin.jvm.functions.Function0 function0 = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009a: CONSTRUCTOR (r8v0 'function0' kotlin.jvm.functions.Function0) = 
                                  (r2v14 'identityDocumentsUploadedFragment' com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment A[DONT_INLINE])
                                 A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment):void (m)] (LINE:3052) call: com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 31 more
                                */
                            /*
                                this = this;
                                r0 = r20
                                r1 = r21
                                androidx.compose.runtime.Composer r1 = (androidx.compose.runtime.Composer) r1
                                r2 = r22
                                java.lang.Number r2 = (java.lang.Number) r2
                                int r2 = r2.intValue()
                                r2 = r2 & 11
                                r3 = 2
                                if (r2 != r3) goto L1e
                                boolean r2 = r1.getSkipping()
                                if (r2 == 0) goto L1e
                                r1.skipToGroupEnd()
                                goto Lb9
                            L1e:
                                java.util.Map r2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState()
                                java.lang.Class<com.ingo.sdk.kotlin.common.IngoSdkConfiguration> r3 = com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class
                                kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
                                java.lang.Object r2 = r2.get(r3)
                                if (r2 == 0) goto Lc4
                                com.ingo.sdk.kotlin.common.IngoSdkConfiguration r2 = (com.ingo.sdk.kotlin.common.IngoSdkConfiguration) r2
                                com.ingo.sdk.kotlin.ux.IngoSdkTheme r2 = r2.getTheme()
                                com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment r3 = r0.Camera2StreamConfigurationMap
                                android.os.Bundle r3 = r3.getArguments()
                                java.lang.String r4 = ""
                                if (r3 == 0) goto L49
                                java.lang.String r5 = "title"
                                java.lang.String r3 = r3.getString(r5)
                                if (r3 != 0) goto L47
                                goto L49
                            L47:
                                r6 = r3
                                goto L4a
                            L49:
                                r6 = r4
                            L4a:
                                com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment r3 = r0.Camera2StreamConfigurationMap
                                android.os.Bundle r3 = r3.getArguments()
                                if (r3 == 0) goto L5d
                                java.lang.String r5 = "details"
                                java.lang.String r3 = r3.getString(r5)
                                if (r3 != 0) goto L5b
                                goto L5d
                            L5b:
                                r7 = r3
                                goto L5e
                            L5d:
                                r7 = r4
                            L5e:
                                int r15 = com.ingo.sdk.android.R.drawable.ic_success_status_icon
                                java.util.Map r3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState()
                                java.lang.Class<androidx.appcompat.app.AppCompatDelegate> r5 = androidx.appcompat.app.AppCompatDelegate.class
                                kotlin.reflect.KClass r5 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r5)
                                java.lang.Object r3 = r3.get(r5)
                                if (r3 == 0) goto Lbc
                                androidx.appcompat.app.AppCompatDelegate r3 = (androidx.appcompat.app.AppCompatDelegate) r3
                                r5 = 8
                                boolean r3 = com.ingo.sdk.android.core.ux.theme.ThemeKt.isNightMode(r3, r1, r5)
                                if (r3 == 0) goto L7f
                                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme r2 = r2.getDark()
                                goto L83
                            L7f:
                                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme r2 = r2.getLight()
                            L83:
                                java.lang.String r2 = r2.getSecondaryColor()
                                int r16 = android.graphics.Color.parseColor(r2)
                                com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment r2 = r0.Camera2StreamConfigurationMap
                                int r3 = com.ingo.sdk.android.R.string.ingo_done
                                java.lang.String r11 = r2.getString(r3)
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r4)
                                com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0 r8 = new com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0
                                com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment r2 = r0.Camera2StreamConfigurationMap
                                r8.<init>(r2)
                                com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1 r12 = new com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1
                                com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment r2 = r0.Camera2StreamConfigurationMap
                                r12.<init>(r2)
                                com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider r2 = new com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider
                                r9 = 0
                                r10 = 0
                                r13 = 0
                                r14 = 0
                                r17 = 0
                                r18 = 2456(0x998, float:3.442E-42)
                                r19 = 0
                                r5 = r2
                                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                                int r3 = com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider.$stable
                                r2.View(r1, r3)
                            Lb9:
                                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                                return r1
                            Lbc:
                                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                                java.lang.String r2 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate"
                                r1.<init>(r2)
                                throw r1
                            Lc4:
                                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                                java.lang.String r2 = "null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration"
                                r1.<init>(r2)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }

                        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment identityDocumentsUploadedFragment) {
                            java.lang.String transactionReferenceNumberFromArgs;
                            transactionReferenceNumberFromArgs = identityDocumentsUploadedFragment.getTransactionReferenceNumberFromArgs();
                            com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(identityDocumentsUploadedFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.IDENTITY_DOCUMENTS_UPLOADED, transactionReferenceNumberFromArgs, null, 4, null);
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment identityDocumentsUploadedFragment) {
                            java.lang.String transactionReferenceNumberFromArgs;
                            identityDocumentsUploadedFragment.trackNavigationPressed();
                            transactionReferenceNumberFromArgs = identityDocumentsUploadedFragment.getTransactionReferenceNumberFromArgs();
                            com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(identityDocumentsUploadedFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.IDENTITY_DOCUMENTS_UPLOADED, transactionReferenceNumberFromArgs, null, 4, null);
                            return kotlin.Unit.INSTANCE;
                        }

                        AnonymousClass1(com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment identityDocumentsUploadedFragment) {
                            this.Camera2StreamConfigurationMap = identityDocumentsUploadedFragment;
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
                                com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1557251168, true, new com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment$onCreateView$1$1.AnonymousClass1(com.ingo.sdk.android.ux.feature.identity_documents_uploaded.IdentityDocumentsUploadedFragment.this), composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                            } else {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }));
                return composeView;
            }
        }
