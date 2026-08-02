package com.paypal.oslo.feature.helpcenter.ui.util;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0010\u001a;\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0005\u001a\u001f\u0010\u0013\u001a\u00020\u00162\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0017"}, d2 = {"", "Lcom/paypal/oslo/feature/helpcenter/domain/models/EcmChild;", "children", "Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement;", "buildInlineElements", "(Ljava/util/List;)Ljava/util/List;", "", "Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment;", "p0", "p1", "", "getHighSpeedVideoSizes", "(Ljava/util/List;Ljava/util/List;)V", "", "p2", "p3", "(Lcom/paypal/oslo/feature/helpcenter/domain/models/EcmChild;ZLjava/util/List;Ljava/util/List;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Image;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/helpcenter/domain/models/EcmChild;)Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Image;", "getHighSpeedVideoFpsRanges", "", "(Ljava/util/List;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InlineContentParserKt {
    public static final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> buildInlineElements(java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> list) {
        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getHighSpeedVideoSizes((com.paypal.oslo.feature.helpcenter.domain.models.EcmChild) it.next(), false, arrayList, arrayList2);
        }
        getHighSpeedVideoSizes(arrayList2, arrayList);
        return arrayList;
    }

    private static final void getHighSpeedVideoSizes(java.util.List<com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment> list, java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> list2) {
        if (list.isEmpty()) {
            return;
        }
        final java.util.List<com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(list);
        if (!highSpeedVideoFpsRanges.isEmpty()) {
            list2.add(new com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Text(com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.util.InlineContentParserKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.helpcenter.ui.util.InlineContentParserKt.$r8$lambda$uSdZicmCsAY5Q9tMeKumcXX5xmU(highSpeedVideoFpsRanges, (com.paypal.pds.core.Builder) obj);
                }
            })));
        }
        list.clear();
    }

    private static final void getHighSpeedVideoSizes(com.paypal.oslo.feature.helpcenter.domain.models.EcmChild ecmChild, boolean z, java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> list, java.util.List<com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment> list2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(ecmChild.getTag(), "img")) {
            getHighSpeedVideoSizes(list2, list);
            com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(ecmChild);
            if (highSpeedVideoFpsRangesFor != null) {
                list.add(highSpeedVideoFpsRangesFor);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(ecmChild.getNode(), "text")) {
            java.lang.String text = ecmChild.getText();
            if (text != null) {
                if (text.length() <= 0) {
                    text = null;
                }
                if (text != null) {
                    list2.add(new com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text(text, z));
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(ecmChild.getNode(), "element")) {
            getHighResolutionOutputSizeshNQ4ISI(ecmChild, z, list, list2);
            return;
        }
        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> children = ecmChild.getChildren();
        if (children != null) {
            java.util.Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                getHighSpeedVideoSizes((com.paypal.oslo.feature.helpcenter.domain.models.EcmChild) it.next(), z, list, list2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r0.equals(util.h.xy.cb.b.f1091) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        r3 = r3.getChildren();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
    
        if (r3 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        if (r3.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        getHighSpeedVideoSizes((com.paypal.oslo.feature.helpcenter.domain.models.EcmChild) r3.next(), true, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        if (r0.equals("strong") != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.helpcenter.domain.models.EcmChild ecmChild, boolean z, java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> list, java.util.List<com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment> list2) {
        java.lang.String tag = ecmChild.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode != -891980137) {
                if (hashCode != 3152) {
                    if (hashCode != 97) {
                        if (hashCode == 98) {
                        }
                    } else if (tag.equals("a")) {
                        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(ecmChild.getChildren());
                        com.paypal.oslo.feature.helpcenter.domain.models.EcmAttribute attr = ecmChild.getAttr();
                        com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute anchorAttribute = attr instanceof com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute ? (com.paypal.oslo.feature.helpcenter.domain.models.AnchorAttribute) attr : null;
                        java.lang.String href = anchorAttribute != null ? anchorAttribute.getHref() : null;
                        if (href == null) {
                            href = "";
                        }
                        java.lang.String str = highSpeedVideoFpsRangesFor;
                        if (str.length() > 0 && href.length() > 0) {
                            list2.add(new com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link(highSpeedVideoFpsRangesFor, href));
                            return;
                        } else {
                            if (str.length() > 0) {
                                list2.add(new com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text(highSpeedVideoFpsRangesFor, z));
                                return;
                            }
                            return;
                        }
                    }
                } else if (tag.equals("br")) {
                    list2.add(com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.LineBreak.INSTANCE);
                    return;
                }
            }
        }
        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> children = ecmChild.getChildren();
        if (children != null) {
            java.util.Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                getHighSpeedVideoSizes((com.paypal.oslo.feature.helpcenter.domain.models.EcmChild) it.next(), z, list, list2);
            }
        }
    }

    private static final com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.helpcenter.domain.models.EcmChild ecmChild) {
        java.lang.String str;
        java.lang.String removeSuffix;
        java.lang.String removeSuffix2;
        com.paypal.oslo.feature.helpcenter.domain.models.EcmAttribute attr = ecmChild.getAttr();
        java.lang.Integer num = null;
        com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute imageAttribute = attr instanceof com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute ? (com.paypal.oslo.feature.helpcenter.domain.models.ImageAttribute) attr : null;
        if (imageAttribute == null || (str = imageAttribute.getSrc()) == null || kotlin.text.StringsKt.isBlank(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        java.lang.String width = imageAttribute.getWidth();
        java.lang.Integer intOrNull = (width == null || (removeSuffix2 = kotlin.text.StringsKt.removeSuffix(width, (java.lang.CharSequence) "px")) == null) ? null : kotlin.text.StringsKt.toIntOrNull(removeSuffix2);
        java.lang.String height = imageAttribute.getHeight();
        if (height != null && (removeSuffix = kotlin.text.StringsKt.removeSuffix(height, (java.lang.CharSequence) "px")) != null) {
            num = kotlin.text.StringsKt.toIntOrNull(removeSuffix);
        }
        return new com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image(str, intOrNull, num, imageAttribute.getAlt());
    }

    private static final java.util.List<com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment> getHighSpeedVideoFpsRanges(java.util.List<? extends com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment> list) {
        if (list.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<? extends com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link link : list2) {
            if (link instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text) {
                com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text text = (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text) link;
                link = new com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text(new kotlin.text.Regex("\\s+").replace(kotlin.text.StringsKt.replace$default(text.getContent(), "&nbsp;", " ", false, 4, (java.lang.Object) null), " "), text.isBold());
            } else if (link instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link) {
                com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link link2 = (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link) link;
                link = new com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link(kotlin.text.StringsKt.trim(new kotlin.text.Regex("\\s+").replace(kotlin.text.StringsKt.replace$default(link2.getText(), "&nbsp;", " ", false, 4, (java.lang.Object) null), " ")).toString(), link2.getHref());
            } else if (!(link instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.LineBreak)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrayList.add(link);
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = arrayList2.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment richTextSegment = (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment) arrayList2.get(i);
            boolean z2 = i == kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
            if (richTextSegment instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text) {
                com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text text2 = (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text) richTextSegment;
                java.lang.String content = text2.getContent();
                if (!z) {
                    content = kotlin.text.StringsKt.trimStart(content).toString();
                }
                if (z2) {
                    content = kotlin.text.StringsKt.trimEnd(content).toString();
                }
                if (content.length() > 0) {
                    arrayList3.add(new com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text(content, text2.isBold()));
                    z = true;
                    i++;
                } else {
                    i++;
                }
            } else if (richTextSegment instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link) {
                arrayList3.add(richTextSegment);
                z = true;
                i++;
            } else {
                if (!(richTextSegment instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.LineBreak)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (z) {
                    arrayList3.add(richTextSegment);
                }
                i++;
            }
        }
        return arrayList3;
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> list) {
        java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.EcmChild> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (com.paypal.oslo.feature.helpcenter.domain.models.EcmChild ecmChild : list) {
            java.lang.String node = ecmChild.getNode();
            if (kotlin.jvm.internal.Intrinsics.areEqual(node, "text")) {
                java.lang.String text = ecmChild.getText();
                if (text == null) {
                    text = "";
                }
                sb.append(text);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(node, "element")) {
                sb.append(getHighSpeedVideoFpsRangesFor(ecmChild.getChildren()));
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uSdZicmCsAY5Q9tMeKumcXX5xmU(java.util.List list, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment richTextSegment = (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment) it.next();
            if (richTextSegment instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text) {
                com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text text = (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text) richTextSegment;
                com.paypal.pds.core.Builder.append$default(builder, text.getContent(), null, text.isBold(), 2, null);
            } else if (richTextSegment instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link) {
                com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link link = (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link) richTextSegment;
                builder.appendLink(link.getText(), link.getHref());
            } else {
                if (!(richTextSegment instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.LineBreak)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.pds.core.Builder.append$default(builder, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, false, 6, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
