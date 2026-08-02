package com.paypal.oslo.feature.helpcenter.ui.util;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\u0005\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00002\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\r\u0010\u0005\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\r\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"", "Lcom/paypal/oslo/feature/helpcenter/domain/models/MobileContent;", "mobileContent", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement;", "parseMobileContentToSections", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/EcmChild;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/helpcenter/domain/models/EcmChild;)Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ListItem;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ContentElement;", "getHighSpeedVideoFpsRanges", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MobileContentParserKt {
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("^h([1-6])$");
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("youtube(?:-nocookie)?\\.com/embed/([a-zA-Z0-9_-]+)");

    /* JADX WARN: Code restructure failed: missing block: B:60:0x011c, code lost:
    
        if (r3.equals("ul") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0128, code lost:
    
        r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2.getTag(), "ul");
        r2 = getHighResolutionOutputSizeshNQ4ISI(r2.getChildren());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        if (r2.isEmpty() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        r2 = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock(r2, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014c, code lost:
    
        r2 = kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
    
        if (r3.equals("ol") != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.BlockElement> parseMobileContentToSections(java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.MobileContent> list) {
        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.MobileContent> filterNotNull;
        java.util.List emptyList;
        kotlin.Pair pair;
        java.lang.String src;
        java.lang.String src2;
        java.lang.String src3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null && (filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(list)) != null) {
            for (com.paypal.oslo.feature.helpcenter.domain.models.MobileContent mobileContent : filterNotNull) {
                com.paypal.oslo.feature.helpcenter.domain.models.MediaSource img = mobileContent.getImg();
                if (img != null && (src3 = img.getSrc()) != null && !kotlin.text.StringsKt.isBlank(src3)) {
                    arrayList.add(new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Paragraph(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image(src3, null, null, null, 14, null))));
                }
                com.paypal.oslo.feature.helpcenter.domain.models.Video video = mobileContent.getVideo();
                if (video != null && (src2 = video.getSrc()) != null && !kotlin.text.StringsKt.isBlank(src2)) {
                    arrayList.add(new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video(src2, mobileContent.getVideo().getPoster()));
                }
                com.paypal.oslo.feature.helpcenter.domain.models.Iframe iframe = mobileContent.getIframe();
                if (iframe != null && (src = iframe.getSrc()) != null && !kotlin.text.StringsKt.isBlank(src)) {
                    arrayList.add(new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube(src));
                }
                java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> children = mobileContent.getChildren();
                if (children != null) {
                    for (com.paypal.oslo.feature.helpcenter.domain.models.EcmChild ecmChild : children) {
                        java.lang.String tag = ecmChild.getTag();
                        kotlin.text.MatchResult matchEntire = tag != null ? Camera2StreamConfigurationMap.matchEntire(tag) : null;
                        if (matchEntire != null) {
                            int parseInt = java.lang.Integer.parseInt(matchEntire.getGroupValues().get(1));
                            java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> buildInlineElements = com.paypal.oslo.feature.helpcenter.ui.util.InlineContentParserKt.buildInlineElements(ecmChild.getChildren());
                            emptyList = !buildInlineElements.isEmpty() ? kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Header(buildInlineElements, parseInt)) : kotlin.collections.CollectionsKt.emptyList();
                        } else {
                            java.lang.String tag2 = ecmChild.getTag();
                            if (tag2 != null) {
                                int hashCode = tag2.hashCode();
                                if (hashCode != -1191214428) {
                                    if (hashCode != 112) {
                                        if (hashCode != 3549) {
                                            if (hashCode != 3735) {
                                                if (hashCode == 110115790) {
                                                    tag2.equals("table");
                                                }
                                            }
                                        }
                                    } else if (tag2.equals("p")) {
                                        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> children2 = ecmChild.getChildren();
                                        if (children2 == null) {
                                            pair = kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList());
                                        } else {
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                            for (java.lang.Object obj : children2) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.helpcenter.domain.models.EcmChild) obj).getTag(), "iframe")) {
                                                    arrayList2.add(obj);
                                                } else {
                                                    arrayList3.add(obj);
                                                }
                                            }
                                            pair = new kotlin.Pair(arrayList2, arrayList3);
                                        }
                                        java.util.List list2 = (java.util.List) pair.component1();
                                        java.util.List list3 = (java.util.List) pair.component2();
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                        java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> buildInlineElements2 = com.paypal.oslo.feature.helpcenter.ui.util.InlineContentParserKt.buildInlineElements(list3);
                                        if (!buildInlineElements2.isEmpty()) {
                                            arrayList4.add(new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Paragraph(buildInlineElements2));
                                        }
                                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                        java.util.Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            com.paypal.oslo.feature.helpcenter.ui.models.BlockElement highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.helpcenter.domain.models.EcmChild) it.next());
                                            if (highSpeedVideoFpsRangesFor != null) {
                                                arrayList5.add(highSpeedVideoFpsRangesFor);
                                            }
                                        }
                                        java.util.Iterator it2 = arrayList5.iterator();
                                        while (it2.hasNext()) {
                                            arrayList4.add((com.paypal.oslo.feature.helpcenter.ui.models.BlockElement) it2.next());
                                        }
                                        emptyList = arrayList4;
                                    }
                                } else if (tag2.equals("iframe")) {
                                    emptyList = kotlin.collections.CollectionsKt.listOfNotNull(getHighSpeedVideoFpsRangesFor(ecmChild));
                                }
                            }
                            emptyList = kotlin.collections.CollectionsKt.emptyList();
                        }
                        arrayList.addAll(emptyList);
                    }
                }
            }
        }
        return arrayList;
    }

    private static final com.paypal.oslo.feature.helpcenter.ui.models.BlockElement getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.helpcenter.domain.models.EcmChild ecmChild) {
        com.paypal.oslo.feature.helpcenter.domain.models.EcmAttribute attr = ecmChild.getAttr();
        com.paypal.oslo.feature.helpcenter.domain.models.IframeAttribute iframeAttribute = attr instanceof com.paypal.oslo.feature.helpcenter.domain.models.IframeAttribute ? (com.paypal.oslo.feature.helpcenter.domain.models.IframeAttribute) attr : null;
        java.lang.String src = iframeAttribute != null ? iframeAttribute.getSrc() : null;
        java.lang.String str = src;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return null;
        }
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(getHighSpeedVideoSizes, str, 0, 2, null);
        if (find$default != null) {
            return new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube("https://www.youtube.com/watch?v=".concat(java.lang.String.valueOf(find$default.getGroupValues().get(1))));
        }
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "youtube", false, 2, (java.lang.Object) null) ? new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube(src) : new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video(src, null);
    }

    private static final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ListItem> getHighResolutionOutputSizeshNQ4ISI(java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> list) {
        if (list == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 1;
        for (com.paypal.oslo.feature.helpcenter.domain.models.EcmChild ecmChild : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(ecmChild.getTag(), "li")) {
                java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ContentElement> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(ecmChild.getChildren());
                if (!highSpeedVideoFpsRanges.isEmpty()) {
                    arrayList.add(new com.paypal.oslo.feature.helpcenter.ui.models.ListItem(highSpeedVideoFpsRanges, i));
                    i++;
                }
            }
        }
        return arrayList;
    }

    private static final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ContentElement> getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> list) {
        if (list == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.paypal.oslo.feature.helpcenter.domain.models.EcmChild ecmChild : list) {
            java.lang.String tag = ecmChild.getTag();
            if (kotlin.jvm.internal.Intrinsics.areEqual(tag, "ol")) {
                getHighSpeedVideoFpsRangesFor(arrayList2, arrayList);
                java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ListItem> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(ecmChild.getChildren());
                if (!highResolutionOutputSizeshNQ4ISI.isEmpty()) {
                    arrayList.add(new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock(highResolutionOutputSizeshNQ4ISI, false));
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(tag, "ul")) {
                getHighSpeedVideoFpsRangesFor(arrayList2, arrayList);
                java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ListItem> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(ecmChild.getChildren());
                if (!highResolutionOutputSizeshNQ4ISI2.isEmpty()) {
                    arrayList.add(new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock(highResolutionOutputSizeshNQ4ISI2, true));
                }
            } else {
                arrayList2.add(ecmChild);
            }
        }
        getHighSpeedVideoFpsRangesFor(arrayList2, arrayList);
        return arrayList;
    }

    private static final void getHighSpeedVideoFpsRangesFor(java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> list, java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ContentElement> list2) {
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator<T> it = com.paypal.oslo.feature.helpcenter.ui.util.InlineContentParserKt.buildInlineElements(kotlin.collections.CollectionsKt.toList(list)).iterator();
        while (it.hasNext()) {
            list2.add((com.paypal.oslo.feature.helpcenter.ui.models.InlineElement) it.next());
        }
        list.clear();
    }
}
