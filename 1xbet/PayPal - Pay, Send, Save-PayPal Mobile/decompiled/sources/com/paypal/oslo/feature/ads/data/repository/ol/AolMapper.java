package com.paypal.oslo.feature.ads.data.repository.ol;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/repository/ol/AolMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Ad;", "", "index", "Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdEntity;", "toDomain$ads_prodRelease", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/Ad;I)Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdEntity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AolMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.ads.data.repository.ol.AolMapper INSTANCE = new com.paypal.oslo.feature.ads.data.repository.ol.AolMapper();

    private AolMapper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x02d7, code lost:
    
        if (r3 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010c, code lost:
    
        if (r3 == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.ads.data.models.ol.OLAdEntity toDomain$ads_prodRelease(com.paypal.oslo.feature.ads.data.models.smithy.Ad ad, int i) {
        com.paypal.oslo.feature.ads.data.models.ol.OLAdAsset oLAdAsset;
        java.lang.String urlX2;
        java.lang.String str;
        java.lang.String urlX1;
        com.paypal.oslo.feature.ads.data.models.smithy.Size size;
        com.paypal.oslo.feature.ads.data.models.smithy.Size size2;
        java.lang.String str2;
        java.lang.String urlX22;
        com.paypal.oslo.feature.ads.data.models.smithy.Size size3;
        com.paypal.oslo.feature.ads.data.models.smithy.Size size4;
        java.lang.String str3;
        java.lang.String urlX23;
        com.paypal.oslo.feature.ads.data.models.smithy.Size size5;
        com.paypal.oslo.feature.ads.data.models.smithy.Size size6;
        java.lang.String impressionStrategy;
        java.lang.String str4;
        java.lang.String rawClickUrl;
        java.lang.String urlX12;
        com.paypal.oslo.feature.ads.data.models.smithy.Size size7;
        com.paypal.oslo.feature.ads.data.models.smithy.Size size8;
        java.lang.String str5 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "");
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{ad.getCampaignId(), ad.getCreativeId(), ad.getFlightId()}), "-", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.ol.AolMapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.ads.data.repository.ol.AolMapper.m11973$r8$lambda$uX_gEw9CLhAlt3igmgB14AlM((java.lang.String) obj);
            }
        }, 30, null);
        if (joinToString$default.length() == 0) {
            joinToString$default = "ad-".concat(java.lang.String.valueOf(i));
        }
        java.lang.String str6 = joinToString$default;
        java.lang.String str7 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ad.getClickUrls());
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ad.getImpressionUrls());
        java.lang.String str10 = str9 == null ? "" : str9;
        java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.Tracker> thirdPartyImpressionTrackers = ad.getThirdPartyImpressionTrackers();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(thirdPartyImpressionTrackers, 10));
        java.util.Iterator<T> it = thirdPartyImpressionTrackers.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.feature.ads.data.models.smithy.Tracker) it.next()).getValue());
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.ads.data.models.smithy.AdResponse response = ad.getResponse();
        int i2 = 250;
        int i3 = 300;
        if (!(response instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd)) {
            if (!(response instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd)) {
                if (!(response instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd)) {
                    if (response instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd) {
                        com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse value = ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd) response).getValue();
                        java.lang.String bgPrimaryColor = value.getBgPrimaryColor();
                        com.paypal.oslo.feature.ads.data.models.smithy.TemplateName templateName = value.getTemplateName();
                        java.lang.String value2 = templateName != null ? templateName.getValue() : null;
                        if (value2 == null) {
                            value2 = "";
                        }
                        java.lang.String str11 = value2;
                        if (str11.length() == 0) {
                            str11 = "PaypalShopCard";
                        }
                        java.lang.String str12 = str11;
                        com.paypal.oslo.feature.ads.data.models.smithy.Image image = value.getImage();
                        if (image != null && (size2 = image.getSize()) != null) {
                            i3 = size2.getWidth();
                        }
                        int i4 = i3;
                        com.paypal.oslo.feature.ads.data.models.smithy.Image image2 = value.getImage();
                        if (image2 != null && (size = image2.getSize()) != null) {
                            i2 = size.getHeight();
                        }
                        int i5 = i2;
                        com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType = com.paypal.oslo.feature.ads.data.models.ol.OLAdType.PAYPAL_SHOP;
                        java.lang.String headline = value.getHeadline();
                        java.lang.String str13 = headline == null ? "" : headline;
                        com.paypal.oslo.feature.ads.data.models.smithy.Image image3 = value.getImage();
                        if (image3 == null || (urlX2 = image3.getUrlX3()) == null) {
                            com.paypal.oslo.feature.ads.data.models.smithy.Image image4 = value.getImage();
                            urlX2 = image4 != null ? image4.getUrlX2() : null;
                            if (urlX2 == null) {
                                com.paypal.oslo.feature.ads.data.models.smithy.Image image5 = value.getImage();
                                urlX2 = image5 != null ? image5.getUrlX1() : null;
                            }
                        }
                        str5 = urlX2;
                        java.lang.String str14 = str5;
                        com.paypal.oslo.feature.ads.data.models.smithy.Brand brand = value.getBrand();
                        if (brand == null || (urlX1 = brand.getUrlX2()) == null) {
                            com.paypal.oslo.feature.ads.data.models.smithy.Brand brand2 = value.getBrand();
                            if (brand2 != null) {
                                urlX1 = brand2.getUrlX1();
                            } else {
                                str = null;
                                com.paypal.oslo.feature.ads.data.models.smithy.Disclaimer disclaimer = value.getDisclaimer();
                                java.lang.String text = disclaimer == null ? disclaimer.getText() : null;
                                com.paypal.oslo.feature.ads.data.models.smithy.Disclaimer disclaimer2 = value.getDisclaimer();
                                java.lang.String linkText = disclaimer2 == null ? disclaimer2.getLinkText() : null;
                                com.paypal.oslo.feature.ads.data.models.smithy.Disclaimer disclaimer3 = value.getDisclaimer();
                                oLAdAsset = new com.paypal.oslo.feature.ads.data.models.ol.OLAdAsset(str12, bgPrimaryColor, i4, i5, oLAdType, str13, null, null, null, null, str14, str, text, linkText, disclaimer3 == null ? disclaimer3.getUrl() : null, 960, null);
                            }
                        }
                        str = urlX1;
                        com.paypal.oslo.feature.ads.data.models.smithy.Disclaimer disclaimer4 = value.getDisclaimer();
                        if (disclaimer4 == null) {
                        }
                        com.paypal.oslo.feature.ads.data.models.smithy.Disclaimer disclaimer22 = value.getDisclaimer();
                        if (disclaimer22 == null) {
                        }
                        com.paypal.oslo.feature.ads.data.models.smithy.Disclaimer disclaimer32 = value.getDisclaimer();
                        oLAdAsset = new com.paypal.oslo.feature.ads.data.models.ol.OLAdAsset(str12, bgPrimaryColor, i4, i5, oLAdType, str13, null, null, null, null, str14, str, text, linkText, disclaimer32 == null ? disclaimer32.getUrl() : null, 960, null);
                    } else {
                        oLAdAsset = new com.paypal.oslo.feature.ads.data.models.ol.OLAdAsset("PaypalNativeTextAndImage", null, 300, 250, com.paypal.oslo.feature.ads.data.models.ol.OLAdType.UNKNOWN, "", null, null, null, null, "", null, null, null, null, 31682, null);
                    }
                } else {
                    com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse value3 = ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd) response).getValue();
                    com.paypal.oslo.feature.ads.data.models.smithy.TemplateName templateName2 = value3.getTemplateName();
                    java.lang.String value4 = templateName2 != null ? templateName2.getValue() : null;
                    if (value4 == null) {
                        value4 = "";
                    }
                    java.lang.String str15 = value4;
                    if (str15.length() == 0) {
                        str15 = "StaticBannerCard";
                    }
                    java.lang.String str16 = str15;
                    com.paypal.oslo.feature.ads.data.models.smithy.Image image6 = value3.getImage();
                    if (image6 != null && (size4 = image6.getSize()) != null) {
                        i3 = size4.getWidth();
                    }
                    int i6 = i3;
                    com.paypal.oslo.feature.ads.data.models.smithy.Image image7 = value3.getImage();
                    if (image7 != null && (size3 = image7.getSize()) != null) {
                        i2 = size3.getHeight();
                    }
                    int i7 = i2;
                    com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType2 = com.paypal.oslo.feature.ads.data.models.ol.OLAdType.IMAGE;
                    com.paypal.oslo.feature.ads.data.models.smithy.Image image8 = value3.getImage();
                    if (image8 == null || (urlX22 = image8.getUrlX2()) == null) {
                        com.paypal.oslo.feature.ads.data.models.smithy.Image image9 = value3.getImage();
                        java.lang.String urlX13 = image9 != null ? image9.getUrlX1() : null;
                        str2 = urlX13 == null ? "" : urlX13;
                    } else {
                        str2 = urlX22;
                    }
                    oLAdAsset = new com.paypal.oslo.feature.ads.data.models.ol.OLAdAsset(str16, null, i6, i7, oLAdType2, "", null, null, null, null, str2, null, null, null, null, 31682, null);
                }
            } else {
                com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse value5 = ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd) response).getValue();
                com.paypal.oslo.feature.ads.data.models.smithy.TemplateName templateName3 = value5.getTemplateName();
                java.lang.String value6 = templateName3 != null ? templateName3.getValue() : null;
                if (value6 == null) {
                    value6 = "";
                }
                java.lang.String str17 = value6;
                if (str17.length() == 0) {
                    str17 = "NativeImageOnlyCard";
                }
                java.lang.String str18 = str17;
                com.paypal.oslo.feature.ads.data.models.smithy.Image image10 = value5.getImage();
                if (image10 != null && (size6 = image10.getSize()) != null) {
                    i3 = size6.getWidth();
                }
                int i8 = i3;
                com.paypal.oslo.feature.ads.data.models.smithy.Image image11 = value5.getImage();
                if (image11 != null && (size5 = image11.getSize()) != null) {
                    i2 = size5.getHeight();
                }
                int i9 = i2;
                com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType3 = com.paypal.oslo.feature.ads.data.models.ol.OLAdType.NATIVE_IMAGE;
                com.paypal.oslo.feature.ads.data.models.smithy.Image image12 = value5.getImage();
                if (image12 == null || (urlX23 = image12.getUrlX2()) == null) {
                    com.paypal.oslo.feature.ads.data.models.smithy.Image image13 = value5.getImage();
                    java.lang.String urlX14 = image13 != null ? image13.getUrlX1() : null;
                    str3 = urlX14 == null ? "" : urlX14;
                } else {
                    str3 = urlX23;
                }
                oLAdAsset = new com.paypal.oslo.feature.ads.data.models.ol.OLAdAsset(str18, null, i8, i9, oLAdType3, "", null, null, null, null, str3, null, null, null, null, 31682, null);
            }
        } else {
            com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse value7 = ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd) response).getValue();
            com.paypal.oslo.feature.ads.data.models.smithy.TemplateName templateName4 = value7.getTemplateName();
            java.lang.String value8 = templateName4 != null ? templateName4.getValue() : null;
            if (value8 == null) {
                value8 = "";
            }
            java.lang.String str19 = value8;
            if (str19.length() == 0) {
                str19 = "PaypalNativeTextAndImage";
            }
            java.lang.String str20 = str19;
            com.paypal.oslo.feature.ads.data.models.smithy.Image image14 = value7.getImage();
            if (image14 != null && (size8 = image14.getSize()) != null) {
                i3 = size8.getWidth();
            }
            int i10 = i3;
            com.paypal.oslo.feature.ads.data.models.smithy.Image image15 = value7.getImage();
            if (image15 != null && (size7 = image15.getSize()) != null) {
                i2 = size7.getHeight();
            }
            int i11 = i2;
            com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType4 = com.paypal.oslo.feature.ads.data.models.ol.OLAdType.NATIVE_TEXT_AND_IMAGE;
            java.lang.String title = value7.getTitle();
            java.lang.String str21 = title == null ? "" : title;
            com.paypal.oslo.feature.ads.data.models.smithy.Image image16 = value7.getImage();
            if (image16 == null || (urlX12 = image16.getUrlX2()) == null) {
                com.paypal.oslo.feature.ads.data.models.smithy.Image image17 = value7.getImage();
                urlX12 = image17 != null ? image17.getUrlX1() : null;
            }
            str5 = urlX12;
            java.lang.String str22 = str5;
            java.lang.String subtitle = value7.getSubtitle();
            com.paypal.oslo.feature.ads.data.models.smithy.Cta cta = value7.getCta();
            oLAdAsset = new com.paypal.oslo.feature.ads.data.models.ol.OLAdAsset(str20, null, i10, i11, oLAdType4, str21, subtitle, null, cta != null ? cta.getText() : null, value7.getAdvertiserName(), str22, value7.getAdvertiserLogoImageUrl(), null, null, null, 28802, null);
        }
        com.paypal.oslo.feature.ads.data.models.ol.OLAdAsset oLAdAsset2 = oLAdAsset;
        com.paypal.oslo.feature.ads.data.models.smithy.AdResponse response2 = ad.getResponse();
        if (response2 instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd) {
            impressionStrategy = ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd) response2).getValue().getImpressionStrategy();
        } else {
            impressionStrategy = response2 instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd ? ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd) response2).getValue().getImpressionStrategy() : null;
        }
        com.paypal.oslo.feature.ads.data.models.smithy.AdResponse response3 = ad.getResponse();
        if (response3 instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd) {
            rawClickUrl = ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd) response3).getValue().getRawClickUrl();
        } else if (response3 instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd) {
            rawClickUrl = ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd) response3).getValue().getRawClickUrl();
        } else if (response3 instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd) {
            rawClickUrl = ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd) response3).getValue().getRawClickUrl();
        } else {
            if (!(response3 instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd)) {
                str4 = null;
                return new com.paypal.oslo.feature.ads.data.models.ol.OLAdEntity(str6, str8, str10, arrayList2, oLAdAsset2, null, impressionStrategy, new com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata(ad.getAdvertiserId(), ad.getCampaignId(), ad.getCreativeId(), ad.getFlightId()), null, null, null, str4, 1792, null);
            }
            rawClickUrl = ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd) response3).getValue().getRawClickUrl();
        }
        str4 = rawClickUrl;
        return new com.paypal.oslo.feature.ads.data.models.ol.OLAdEntity(str6, str8, str10, arrayList2, oLAdAsset2, null, impressionStrategy, new com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata(ad.getAdvertiserId(), ad.getCampaignId(), ad.getCreativeId(), ad.getFlightId()), null, null, null, str4, 1792, null);
    }

    /* renamed from: $r8$lambda$uX-_gEw9CLhAlt-3igmgB14Al-M, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m11973$r8$lambda$uX_gEw9CLhAlt3igmgB14AlM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return str;
    }
}
