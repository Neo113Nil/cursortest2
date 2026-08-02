package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/pdf/DirectDepositPdfDrawer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "pdfFile", "Lcom/paypal/oslo/feature/directdeposit/ui/pdf/DirectDepositUserData;", "userData", "Landroid/graphics/Bitmap;", "checkBitmap", "paypalBitmap", "signatureBitmap", "", "pageWidth", "pageHeight", "pageStart", "lineHeight", "imageWidth", "signSize", "", "generatePdf", "(Landroid/content/Context;Ljava/io/File;Lcom/paypal/oslo/feature/directdeposit/ui/pdf/DirectDepositUserData;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;IIIIII)V", "resId", "loadDrawableAsBitmap", "(Landroid/content/Context;I)Landroid/graphics/Bitmap;", "createSignatureBitmap", "()Landroid/graphics/Bitmap;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositPdfDrawer {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfDrawer INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfDrawer();

    private DirectDepositPdfDrawer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.graphics.pdf.PdfDocument] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.graphics.pdf.PdfDocument] */
    public final void generatePdf(android.content.Context context, java.io.File pdfFile, com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositUserData userData, android.graphics.Bitmap checkBitmap, android.graphics.Bitmap paypalBitmap, android.graphics.Bitmap signatureBitmap, int pageWidth, int pageHeight, int pageStart, int lineHeight, int imageWidth, int signSize) {
        android.graphics.pdf.PdfDocument pdfDocument;
        java.lang.Throwable th;
        java.lang.IllegalStateException illegalStateException;
        java.io.IOException iOException;
        ?? r1;
        android.graphics.pdf.PdfDocument.Page startPage;
        android.graphics.Canvas canvas;
        com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPaints pdfPaints;
        android.graphics.Paint paint;
        float f;
        java.lang.StringBuilder sb;
        android.content.Context context2 = context;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdfFile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userData, "");
        ?? pdfDocument2 = new android.graphics.pdf.PdfDocument();
        try {
            try {
                startPage = pdfDocument2.startPage(new android.graphics.pdf.PdfDocument.PageInfo.Builder(pageWidth, pageHeight, 1).create());
                canvas = startPage.getCanvas();
                android.graphics.Paint paint2 = new android.graphics.Paint();
                paint2.setTextAlign(android.graphics.Paint.Align.LEFT);
                paint2.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1));
                paint2.setTextSize(50.0f);
                paint2.setColor(-16777216);
                android.graphics.Paint paint3 = new android.graphics.Paint();
                paint3.setTextAlign(android.graphics.Paint.Align.LEFT);
                paint3.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
                paint3.setTextSize(30.0f);
                paint3.setColor(-16777216);
                android.graphics.Paint paint4 = new android.graphics.Paint();
                paint4.setStyle(android.graphics.Paint.Style.STROKE);
                paint4.setStrokeWidth(2.0f);
                paint4.setColor(-3355444);
                pdfPaints = new com.paypal.oslo.feature.directdeposit.ui.pdf.PdfPaints(paint2, paint3, paint4, -16777216, -3355444);
                kotlin.jvm.internal.Intrinsics.checkNotNull(canvas);
                paint = new android.graphics.Paint();
                paint.setColor(-1);
                f = pageWidth - 35.0f;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            try {
                canvas.drawRect(35.0f, 50.0f, f, 1700.0f, paint);
                float f2 = pageStart;
                canvas.drawText(context2.getString(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_form_header_title), f2, 170.0f, pdfPaints.getTitlePaint());
                float f3 = pageWidth - pageStart;
                canvas.drawLine(f2, 220.0f, f3, 220.0f, pdfPaints.getDividerPaint());
                java.lang.String string = context2.getString(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_pdf_screen_text1);
                java.lang.String userName = userData.getUserName();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(string);
                sb2.append(" ");
                sb2.append(userName);
                canvas.drawText(sb2.toString(), f2, 300.0f, pdfPaints.getBodyPaint());
                java.lang.String string2 = context2.getString(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_pdf_screen_text12);
                java.lang.String employerName = userData.getEmployerName();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(string2);
                sb3.append(" ");
                sb3.append(employerName);
                canvas.drawText(sb3.toString(), 570.0f, 300.0f, pdfPaints.getBodyPaint());
                canvas.drawLine(120.0f, 320.0f, 570.0f, 320.0f, pdfPaints.getDividerPaint());
                canvas.drawLine(710.0f, 320.0f, f3, 320.0f, pdfPaints.getDividerPaint());
                canvas.drawText(context2.getString(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_pdf_screen_text2), f2, 360.0f, pdfPaints.getBodyPaint());
                if (userData.isPercentage()) {
                    try {
                        java.lang.String amount = userData.getAmount();
                        sb = new java.lang.StringBuilder();
                        sb.append(amount);
                        sb.append("%");
                    } catch (java.io.IOException e) {
                        iOException = e;
                        pdfDocument = pdfDocument2;
                        com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("Failed to write PDF to file", iOException);
                        pdfDocument.close();
                    } catch (java.lang.IllegalStateException e2) {
                        illegalStateException = e2;
                        pdfDocument = pdfDocument2;
                        com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("Failed to generate PDF: document in invalid state", illegalStateException);
                        pdfDocument.close();
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        r1 = pdfDocument2;
                        r1.close();
                        throw th;
                    }
                } else {
                    java.lang.String amount2 = userData.getAmount();
                    sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
                    sb.append(amount2);
                }
                java.lang.String obj = sb.toString();
                java.lang.String string3 = context2.getString(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_pdf_screen_text3);
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(obj);
                sb4.append(" ");
                sb4.append(string3);
                canvas.drawText(sb4.toString(), f2, 420.0f, pdfPaints.getBodyPaint());
                canvas.drawText(context2.getString(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_pdf_screen_subtitle2), f2, 480.0f, pdfPaints.getBodyPaint());
                canvas.drawText(userData.getUserFirstName(), f2, 540.0f, pdfPaints.getBodyPaint());
                if (checkBitmap != null) {
                    android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(checkBitmap, imageWidth, 540, true);
                    canvas.drawBitmap(createScaledBitmap, f2, 580.0f, (android.graphics.Paint) null);
                    createScaledBitmap.recycle();
                }
                float textSize = pdfPaints.getBodyPaint().getTextSize();
                int color = pdfPaints.getBodyPaint().getColor();
                pdfPaints.getBodyPaint().setTextSize(27.0f);
                pdfPaints.getBodyPaint().setColor(pdfPaints.getBlackColor());
                if (userData.getBankName().length() > 0) {
                    canvas.drawText(userData.getBankName(), 170.0f, 660.0f, pdfPaints.getBodyPaint());
                }
                canvas.drawText(userData.getRoutingNumber(), 190.0f, 1020.0f, pdfPaints.getBodyPaint());
                canvas.drawText(userData.getAccountNumber(), 520.0f, 1020.0f, pdfPaints.getBodyPaint());
                canvas.drawText(userData.getAccountType(), 900.0f, 1020.0f, pdfPaints.getBodyPaint());
                pdfPaints.getBodyPaint().setTextSize(textSize);
                pdfPaints.getBodyPaint().setColor(color);
                pdfPaints.getBodyPaint().setTextSize(35.0f);
                pdfPaints.getBodyPaint().setColor(pdfPaints.getGrayColor());
                float f4 = lineHeight;
                float f5 = 50.0f + f4;
                canvas.drawText(context2.getString(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_pdf_screen_subtitle3), f2, f5, pdfPaints.getBodyPaint());
                android.graphics.Bitmap createSignatureBitmap = signatureBitmap == null ? createSignatureBitmap() : signatureBitmap;
                int i = pageWidth - 750;
                float min = java.lang.Math.min((i - pageStart) / createSignatureBitmap.getWidth(), signSize / createSignatureBitmap.getHeight());
                android.graphics.Bitmap createScaledBitmap2 = android.graphics.Bitmap.createScaledBitmap(createSignatureBitmap, java.lang.Math.max(1, (int) (createSignatureBitmap.getWidth() * min)), java.lang.Math.max(1, (int) (createSignatureBitmap.getHeight() * min)), true);
                canvas.drawBitmap(createScaledBitmap2, f2 + 20.0f, lineHeight - r7, (android.graphics.Paint) null);
                createScaledBitmap2.recycle();
                if (signatureBitmap == null) {
                    createSignatureBitmap.recycle();
                }
                canvas.drawLine(f2, f4, i, f4, pdfPaints.getDividerPaint());
                canvas.drawText(context2.getString(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_pdf_screen_subtitle4), 750.0f, f5, pdfPaints.getBodyPaint());
                pdfPaints.getBodyPaint().setColor(pdfPaints.getBlackColor());
                canvas.drawText(new java.text.SimpleDateFormat("MMMM dd, yyyy", java.util.Locale.ENGLISH).format(new java.util.Date()), 750.0f, f4 - 20.0f, pdfPaints.getBodyPaint());
                canvas.drawLine(750.0f, f4, f3, f4, pdfPaints.getDividerPaint());
                canvas.drawRect(35.0f, 50.0f, f, 1700.0f, pdfPaints.getDividerPaint());
                if (paypalBitmap != null) {
                    canvas.drawBitmap(paypalBitmap, (pageWidth - paypalBitmap.getWidth()) / 2.0f, pageHeight - 200, (android.graphics.Paint) null);
                }
                pdfDocument = pdfDocument2;
            } catch (java.io.IOException e3) {
                e = e3;
                pdfDocument = pdfDocument2;
            } catch (java.lang.IllegalStateException e4) {
                e = e4;
                pdfDocument = pdfDocument2;
            } catch (java.lang.Throwable th4) {
                th = th4;
                context2 = pdfDocument2;
                th = th;
                r1 = context2;
                r1.close();
                throw th;
            }
            try {
                pdfDocument.finishPage(startPage);
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(pdfFile);
                try {
                    pdfDocument.writeTo(fileOutputStream);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                    pdfDocument.close();
                } finally {
                }
            } catch (java.io.IOException e5) {
                e = e5;
                iOException = e;
                com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("Failed to write PDF to file", iOException);
                pdfDocument.close();
            } catch (java.lang.IllegalStateException e6) {
                e = e6;
                illegalStateException = e;
                com.paypal.oslo.feature.directdeposit.LoggerKt.log.e("Failed to generate PDF: document in invalid state", illegalStateException);
                pdfDocument.close();
            }
        } catch (java.io.IOException e7) {
            e = e7;
            pdfDocument = pdfDocument2;
        } catch (java.lang.IllegalStateException e8) {
            e = e8;
            pdfDocument = pdfDocument2;
        } catch (java.lang.Throwable th5) {
            th = th5;
            context2 = pdfDocument2;
        }
    }

    public final android.graphics.Bitmap loadDrawableAsBitmap(android.content.Context context, int resId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, resId);
        if (drawable == null) {
            return null;
        }
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(drawable.getIntrinsicWidth(), 1);
        int coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(drawable.getIntrinsicHeight(), 1);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(coerceAtLeast, coerceAtLeast2, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, coerceAtLeast, coerceAtLeast2);
        drawable.draw(canvas);
        return createBitmap;
    }

    public final android.graphics.Bitmap createSignatureBitmap() {
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(200, 200, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-16777216);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(20.0f, 120.0f);
        path.cubicTo(40.0f, 60.0f, 70.0f, 90.0f, 100.0f, 70.0f);
        path.cubicTo(130.0f, 50.0f, 140.0f, 110.0f, 170.0f, 100.0f);
        path.cubicTo(190.0f, 95.0f, 200.0f, 130.0f, 200.0f, 130.0f);
        canvas.drawPath(path, paint);
        return createBitmap;
    }
}
